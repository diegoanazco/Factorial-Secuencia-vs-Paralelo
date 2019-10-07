package secuencial;

//Solución Recursiva

public class Main1 {
	
	static long factorial_recursive(long n)
	{
		if (n == 0)
			return 1;
		return n * factorial_recursive(n-1);
	}

	public static void main(String[] args)
	{
		long num = 10;
		System.out.println(factorial_recursive(num));
	}
}
