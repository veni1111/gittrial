public class Library
{
	private int salary = 20000;
	
int mfee = 10;
public void lendbooks()
{
System.out.println("Lending books");
}
	private void getsalary()
	{
		System.out.println(salary);
	}
	
	public static void main(String[] args)
{
Library librarian = new Library();
librarian.getsalary();
System.out.println(librarian.salary);
	
}
}