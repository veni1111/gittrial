public  class School
{
public static void main(String[] args)
{
School st1 = new School();
	School st2 = new School();
	st2.buysnacks(10);//passing values as arguments
st1.takeanswersheets();//passing objects as arguments
}public void buysnacks(int purse)
	{
		System.out.println("buying snacks");
	System.out.println("purse");
	
	
	}
	
	public void takeanswersheets(School student)
	{
		System.out.println("take all answer sheets");
	}
}