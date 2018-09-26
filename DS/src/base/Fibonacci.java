package base;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fibonacci fb=new Fibonacci();
		fb.fib(10);
		
		
		
	}
	public void fib(int num)
	{
        int first = 0,second=1,sum=0;
		System.out.println(first +"\n"+second);
		for(int i=0;i<num-2;i++)
		{
			
			sum = first+second;
			first=second;
			second=sum;
			System.out.println(sum);
		}

	}

}
