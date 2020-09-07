//CREATING A STUDENT CLASS FOR EXAMPLE ONSINGLE LEVEL INHERITANCE
public class STUDENT													//PARENT CLASS
{
	private int sno;
	private String name,course;
	private long phn;
	public void setData(int sno,String name,String course,long phn)		//METHOD FOR SETTING DATA
	{
		this.sno=sno;
		this.name=name;
		this.course=course;
		this.phn=phn;
	}
	public void showData()												//METHOD FOR SHOWING DATA
	{
		System.out.println("SNO     :"+this.sno);
		System.out.println("NAME	:"+this.name);
		System.out.println("COURSE	:"+this.course);
		System.out.println("PHN NUMB:"+this.phn);
	}
}