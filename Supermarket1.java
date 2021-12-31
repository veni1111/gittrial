public class Supermarket1
{
static String name = "veni";
static int doorno = 1234;
int price,discount;
String brand;
	public Supermarket1(int i, int j, String s)
	{
		System.out.println("CHECK");
		price = i;
		discount = j;
		brand = s;
	}
	public Supermarket1(int i, String s)
	{
		price = i;
		brand = s;
	}
	public Supermarket1(String s,int i)
	{
		price = i;
		brand = s;
	}
	public Supermarket1()
	{
		System.out.println("Hi");
		}
public static void main(String[] args)
						{
							Supermarket1 prod1 = new Supermarket1(100, 20, "ABCD");
							
							Supermarket1 prod2 = new Supermarket1(200, 30, "BCD");
							Supermarket1 prod3 = new Supermarket1(10, "PQR");
	                        Supermarket1 prod4 = new Supermarket1("XYZ", 20);
                            Supermarket1 prod5 = new Supermarket1();
							prod1.buy();
							prod2.buy();
	                        prod3.buy();
	                        prod4.buy();
	                        prod5.buy();


						}
public void buy()
{
	System.out.println(price); 
	System.out.println(discount); 
	System.out.println(brand); 


}
}