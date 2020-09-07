//CREATING A EMPLOYE CLASS FOR HW12 ON SINGLE LEVEL INHERITANCE
public class EMPLOYE												//PARENT CLASS
{
	private int id;													//DECLARING PROPERTIES
	private String name,desig,exp;
	public void setData(int id,String name,String desig,String exp)		//METHOD FOR SETTING DATA
	{
		this.id=id;
		this.name=name;
		this.desig=desig;
		this.exp=exp;
	}
	public void showData()													//METHOD FOR GETTING DATA
	{
		System.out.println("ID          :"+this.id);
		System.out.println("NAME        :"+this.name);
		System.out.println("DESIGNATION :"+this.desig);
		System.out.println("EXPERIENCE  :"+this.exp);
	}
}
