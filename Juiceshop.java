package chennai;
public
	class Juiceshop//javac -d . Juiceshop.java
{                     //java chennai.Juiceshop
  String name = "muruga";
	public static void main(String[] args)
	{
		Juiceshop sk = new Juiceshop();
		sk.preparejuice(20);
		sk.preparejuice();
		sk.preparejuice(false);
		sk.register();
	}
	public void preparejuice()
	{
	System.out.println("Head branch registered");
	}
	
	
	
	public void preparejuice(boolean milk)
	{
	System.out.println("milk:"+ milk);
	}
	
	public void preparejuice()
	{
	System.out.println("withoutsugar");
	}
	public void preparejuice(int sugar)
	{
	System.out.println("sugar");
	}
}
	
	
	