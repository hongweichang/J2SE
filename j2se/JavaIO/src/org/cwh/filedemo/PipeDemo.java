package org.cwh.filedemo;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

class Send implements Runnable {

	private static String send;

	private PipedOutputStream pos = null;

	public PipedOutputStream getPos() {
		return pos;
	}

	public Send(String send) {
		this.pos = new PipedOutputStream();
		this.send = send;
	}

	@Override
	public void run() {
		System.out.println("send线程启动！");
		try {

			pos.write(send.getBytes());
			pos.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

class Recv implements Runnable {

	private PipedInputStream pis = null;

	public Recv() {
		this.pis = new PipedInputStream();
	}

	public PipedInputStream getPis() {
		return pis;
	}

	@Override
	public void run() {
		System.out.println("recv 线程启动！");
		try {
			byte[] b = new byte[1024];
			int len = 0;
			len = pis.read(b);
			System.out.println(new String(b, 0, len) + "已收到");
			pis.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

public class PipeDemo {

	public static void main(String[] args) throws IOException {

		Send send = new Send("sendfile");
		Recv recv = new Recv();
		send.getPos().connect(recv.getPis());
		new Thread(send).start();
		new Thread(recv).start();

	}
}
