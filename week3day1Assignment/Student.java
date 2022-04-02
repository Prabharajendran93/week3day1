package week3day1Assignment;

public class Student {
	public void getStdtInfo(int id)
	{
		
		System.out.println(id);
	}
	

	public void getStdtInfo(int id,String name)
	{
		
		System.out.println( id + name);
	}
	
	public void getStdtInfo(String email, long phonenum)
	{
		
		System.out.println(email +  phonenum);
	}
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		Student info = new Student();
		info.getStdtInfo(23);
		info.getStdtInfo(23, "prabha");
		info.getStdtInfo("prabha@gmail.com", 9876543210l);
	}

}
