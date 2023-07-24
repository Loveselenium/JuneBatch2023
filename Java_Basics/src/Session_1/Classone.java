package Session_1;

public class Classone 
{
	int Roll_No, Age;
	public void Method1()
	{
		System.out.println("Welcome all of you");
	}
	public void Method2()
	{
		System.out.println("Automation is very easy");
	}
	public static void main(String[] args) 
	{
		Classone obj=new Classone();
		int a=obj.Roll_No=1234;
		System.out.println("Roll number is " +a);
		
		int b=obj.Age=24;
		System.out.println("Age is " +b);
		
		obj.Method1();
		obj.Method2();
		
	}
}
