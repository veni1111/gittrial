public class Humanbeing
{
int amount; //global variable
public static void main(String[] args)
{
Humanbeing hb = new Humanbeing();
	hb.amount = 10000;
	
	System.out.println("hb amount " + hb.amount);
	Humanbeing hb2 = new Humanbeing();
	hb2.amount = 10000;
	hb2.getveg(200);
	Humanbeing.paint();
}
public void getveg(int amount)
	{
		System.out.println(amount);
		System.out.println("local amount " + amount); 
	System.out.println("global amount " +  this.amount);  //current object
	}
	 public static void paint()
	 {
		 System.out.println(this.amount);
	 }
		
}

	