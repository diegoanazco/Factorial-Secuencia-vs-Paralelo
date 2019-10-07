package secuencial;

// Solución recursiva, con n numeros

public class Main3 {
	
	static long factorial_recursive(long n)
	{
		if (n == 0)
			return 1;
		return n * factorial_recursive(n-1);
	}

	static void n_numeros(int x)
	{
		int i = 0;
		long num;
		while (i < x)
		{
			num = (int)(Math.random()*20);
			System.out.println("Numero: " + num +  " --> " +factorial_recursive(num));
			i++;
		}
	}
	
	public static void main(String[] args)
	{
		int num = (int)(Math.random()*100);
		n_numeros(num);
	}
}
