package secuencial;

// Solución recursiva, con un numero random

public class Main2 {
	
	static long factorial_recursive(long n)
	{
		if (n == 0)
			return 1;
		return n * factorial_recursive(n-1);
	}


	public static void main(String[] args)
	{
		long num = (int)(Math.random()*25);
		System.out.println("Numero: " + num);
		System.out.println(factorial_recursive(num));
	}
}
