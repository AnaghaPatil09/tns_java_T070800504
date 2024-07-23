
public class Demo {
	//data members
	//member function
	
	private int dd, mm, yy;//instance variable
	public void initDate()
	{
		dd=mm=yy=1;
	}
	public void setDate(int d, int m,int y )
	{
		dd=d;
		mm=m;
		yy=y;
	}
	public void displayDate()
	{
		System.out.println("Date = ["+dd+"/"+mm+"/"+yy+"]");
	}
	
	public static void main(String[] args)
	{
		Demo d = new Demo();
		System.out.println("d = "+ d.dd);
		System.out.println("m = "+ d.mm);
		System.out.println("y = "+ d.yy);
		d.initDate();
		d.displayDate();
		d.setDate(3, 7, 2024);
		d.displayDate();
	}
}
