package org.cwh.filedemo;

public class BufferedDemoMenu {

	public BufferedDemoMenu() throws Exception{
		while (true) {
			this.show();
		}
		
	}
	
	public  void show() throws Exception {
		System.out.println("===== xxx系统 =====");
		System.out.println("   [1]增加数据   ");
		System.out.println("   [2]查看数据   ");
		System.out.println("   [3]修改数据   ");
		System.out.println("   [4]删除数据   ");
		System.out.println("   [0]退出系统   ");
		int choose = new InputData().getInt("\n请选择:", "输入错误，请重新输入,");
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
			System.out.println("系统退出!");
			System.exit(1);
			break;
		default:
			System.out.println("无效的选项");
			break;
		}
		
	}
}
