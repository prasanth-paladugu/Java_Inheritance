//TH CLASS FOR EX4 ON MULTILEVEL INHERITANCE
public class TH extends TW		//CHILD CLASS OF TW
{
	protected int z;			//DECLARING VARIABLE PROTECTEDLY
	public void setZ(int z)		//METHOD FOR SETTING DATA
	{
		this.z=z;
	}
	public int getZ()			//METHODFOR GETTING DATA
	{
		return this.z;
	}
	public void showAll()		//METHOD FOR GETTING ALL DATA
	{
		System.out.println("X	:"+this.x);
		System.out.println("Y	:"+this.y);
		System.out.println("Z	:"+this.z);
	}
}