package Session_2;

//Assignment: ((((10+2)+2)-2)*2)/2)

public class Classtwo
{
	int a, b;
	
	public int addition(int a, int b)
	{
		int add=a+b;
		return add;
	}
	public int subtraction(int a, int b)
	{
		int sub=a-b;
		return sub;
	}
	public int multiplication(int a, int b)
	{
		int mul=a*b;
		return mul;
	}
	public void division(int a, int b)
	{
	int div=a/b;
	System.out.println("Final Results is " +div);
	}
		public static void main(String[] args)
		{
			Classtwo obj=new Classtwo();
			int add_sum=obj.addition(10, 2);
			int add_sum1=obj.addition(add_sum, 2);
			
			int sub_sum=obj.subtraction(add_sum1, 2);
			
			int mul_sum=obj.multiplication(add_sum, 2);
			
			obj.division(mul_sum, 2);
		}
}