package secuencial;

// Solución recursiva, con n numeros

public class Main4 {
	
	static long factorial_recursive(long n)
	{
		if (n == 0)
			return 1;
		return n * factorial_recursive(n-1);
	}

	static long n_numeros(int x)
	{
		int i = 0;
		long num = 0;
		long start = System.nanoTime();
		while (i < x)
		{
			System.out.println("Numero: " + i +  " --> " +factorial_recursive(i));
			i++;
		}
		System.out.println("***********************");
		return System.nanoTime() - start;
	}
	
	public static void main(String[] args)
	{
		int num =20;
		System.out.println(n_numeros(num));
	}
}
