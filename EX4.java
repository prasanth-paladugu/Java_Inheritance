//EXAMPLE ON MULTILEVEL INHERITANCE
public class EX4							//MAIN CLASS
{
	public static void main(String[]arg)
	{
		TH ob=new TH();						//CREATING AN OBJECT AND ASSIGNING A REFERENCE TO OBJECT
		ob.setX(10);						//CALLING A METHOD FROM ANOTHER CLASS USING OBJECT
		System.out.println(ob.getX());
		ob.setY(20);
		ob.setZ(30);
		ob.showAll();
	}
}