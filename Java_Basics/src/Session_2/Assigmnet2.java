package Session_2;

//ASsigment: (((((10*2)-2)+2)-2)/2)

public class Assigmnet2 
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
			//ASsigment: (((((10*2)-2)+2)-2)/2)
			
			Assigmnet2 obj=new Assigmnet2();
			int mul_sum=obj.multiplication(10, 2);
			int sub_sum=obj.subtraction(mul_sum, 2);
			int add_sum=obj.addition(sub_sum, 2);
			int sub_sum1=obj.subtraction(add_sum, 2);
			obj.division(sub_sum1, 2);
		}
}
