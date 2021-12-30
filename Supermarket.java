public class Supermarket
{
static String name = "veni";
static int doorno = 1234;
int price,discount;
String brand;
public static void main(String[] args)
						{
							Supermarket prod1 = new Supermarket(100, 20, "ABCD");
							//prod1.price = 100;
							//prod1.discount = 20;
							//prod1.brand = "ABCD";
							Supermarket prod2 = new Supermarket(200, 30, "BCD");
							//prod2.price = 200;
							//prod2.discount = 30;
							//prod2.brand = "BCD";
							prod1.buy();
							prod2.buy();
	Supermarket prod3 = new Supermarket();
	prod3.buy();
						}
						public void buy()
						 {
							 System.out.println(price);
							 System.out.println(discount);
							 System.out.println(brand);

						}
}
