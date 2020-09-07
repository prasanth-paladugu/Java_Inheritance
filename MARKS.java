//MARKS CLASS FOR EX3 ON SINGLE LEVEL INHERITANCE
public class MARKS extends STUDENT					//CHILD CLASS OF STUDENT CLASS
{
	private int t1,t2,t3,tot;						//DECLARING VARIABLES PRIVATELY
	private double AVG;
	public void setMarks(int t1,int t2,int t3)		//METHOD FOR SETTING DATA
	{
		this.t1=t1;
		this.t2=t2;
		this.t3=t3;
	}
	private void cal()								//METHOD  FOR CALCULATIONS
	{
		tot=t1+t2+t3;
		AVG=tot/3.0;
	}
	public void getData()							//METHOD FOR GETTING DATA
	{
		showData();
		cal();
		System.out.println("TOTAL	:"+tot);
		System.out.println("AVERAGE	:"+AVG);
	}
}