
public class Fibonacci {

	public static void main(String[] args) {
		
	System.out.println("F1 = " + 1 );
	System.out.println("F2  = " + 1);
	for(int i = 3; i<11; i++)
	{
		System.out.println("F"+i + "  = " + "F"+ (i-1) + "+ F" +(i-2) + "  = "+ fibonacci(i));
	}

	}
	
	static int fibonacci(int f)
	{
		if(f == 0)
			return 0;
		else if(f==1)
			return 1;
		else
			return fibonacci(f-1) + fibonacci(f-2);
	}

}
