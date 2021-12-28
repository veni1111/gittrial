public class Groceryshop//class
{
static String name = "krishnaveni";
static int doorno = 9999;//variable decalaration
public static void main(String[] args)
{
Groceryshop gs = new Groceryshop();//instance (or) object creation
float balance = gs.buy();
gs.comeback(balance,name,doorno);
}
public float buy()
{
    int n1=100, n2=2;
	float result = n1/n2;
	return result;//return 50
}
public void comeback(float balance,String name,int doorno)
{
System.out.println(balance);
System.out.println(name);
System.out.println(doorno);
	}
}
	