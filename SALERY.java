//SALERY CLASS HW12 ON SINGLE LEVEL INHERITANCE
public class SALERY	extends EMPLOYE						//CHILD CLASS OF EMPLOYEE CLASS
{
	private double sal,GS,NS,HRA,TA,PF,PT,ET;			//DECLARING VARIABLES
	public void setSalery(double sal)					//METHOD FOR SETTING DATA
	{
		this.sal=sal;
	}
	private void cal()									//MEHOD FOR CALCULATIONS
	{
		HRA=this.sal*0.4;
		TA=this.sal*0.2;
		PF=this.sal*0.12;
		PT=this.sal*0.1;
		ET=this.sal*0.05;
		GS=this.sal+HRA+TA+ET;
		NS=GS-PF-PT;
	}
	public void getDetails()							//METHOD FOR GETTING DETAILS
	{
		showData();
		cal();
		System.out.println("SALERY       :"+this.sal);
		System.out.println("HRA          :"+HRA);
		System.out.println("TA           :"+TA);
		System.out.println("PF           :"+PF);
		System.out.println("PT           :"+PT);
		System.out.println("ET           :"+ET);
		System.out.println("GROSS SALARY :"+GS);
		System.out.println("NET SALARY   :"+NS);
	}
}