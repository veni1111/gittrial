package korea.south;
public class Desktop extends Samsung
{
public static void main(String[] args)
{
Desktop dt = new Desktop();
dt.makequality();
dt.givewarranty();
System.out.println(dt.pinNo);
dt.changepin();
}
}