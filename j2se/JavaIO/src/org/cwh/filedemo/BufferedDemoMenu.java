package org.cwh.filedemo;

public class BufferedDemoMenu {

	public BufferedDemoMenu() throws Exception{
		while (true) {
			this.show();
		}
		
	}
	
	public  void show() throws Exception {
		System.out.println("===== xxxϵͳ =====");
		System.out.println("   [1]��������   ");
		System.out.println("   [2]�鿴����   ");
		System.out.println("   [3]�޸�����   ");
		System.out.println("   [4]ɾ������   ");
		System.out.println("   [0]�˳�ϵͳ   ");
		int choose = new InputData().getInt("\n��ѡ��:", "�����������������,");
		switch (choose) {
		case 1:
			Operate.add();
			break;
		case 2:
			Operate.find();
			break;
		case 3:
			Operate.update();
			break;
		case 4:
			Operate.delete();
			break;
		case 0:
			System.out.println("ϵͳ�˳�!");
			System.exit(1);
			break;
		default:
			System.out.println("��Ч��ѡ��");
			break;
		}
		
	}
}
