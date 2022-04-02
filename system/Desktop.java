package org.system;

public class Desktop extends Computer{
	
	public void desktopSize() {
		System.out.println("the size of desktop is displayed");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Desktop dt = new Desktop();
		dt.computerModel();
		dt.desktopSize();
	}

}
