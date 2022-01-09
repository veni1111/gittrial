package chennai;
public class Juiceshop2 extends Juiceshop
{
String name = "thendral";
public static void main(String[] args)
{
Juiceshop2 sk = new Juiceshop2();
sk.register();
System.out.println(sk.name);
}
public void register()
{
System.out.println("Branch 2 registered");
}
}



