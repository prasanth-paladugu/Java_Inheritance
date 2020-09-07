//EX5 ON HIREARCHIAL INHERITANCE
import java.util.Scanner;
public class EX5									//MAIN CLASS
{
	static int x,y;									//DECLARING VARIABLES STATICLY
	static Scanner in=new Scanner(System.in);
	public static void main(String[]args)
	{
		System.out.println("\nMENU :"+"\n1.ADDITION"+"\n2.SUBTRACTION"+"\n3.MULTIPLICATION"+"\n4.DIVISION"+"\n5.MODULAR DIVISION"+"\n6.EXIT");
		System.out.println("ENTER YOUR OPTION ");
		int op=in.nextInt();						//CREATING A SCANNER OBJECT
		switch(op)
		{
			case 1:ADD o1=new ADD();
			readData();
			o1.setX(x);
			o1.setY(y);
			o1.cal();
			break;
			case 2:SUB o2=new SUB();
			readData();
			o2.setX(x);
			o2.setY(y);
			o2.cal();
			break;
			case 3:MUL o3=new MUL();
			readData();
			o3.setX(x);
			o3.setY(y);
			o3.cal();
			break;
			case 4:DIV o4=new DIV();
			readData();
			o4.setX(x);
			o4.setY(y);
			o4.cal();
			break;
			case 5:MDIV o5=new MDIV();
			readData();
			o5.setX(x);
			o5.setY(y);
			o5.cal();
			break;
			case 6:System.exit(0);
		}
		main(null);										//CALLING MAIN METHOD
	}
	static void readData()								//METHOD FOR ASSIGNING DATA FROM USER
	{
		System.out.println("ENTER X,Y VALUES");
		x=in.nextInt();
		y=in.nextInt();
	}
}