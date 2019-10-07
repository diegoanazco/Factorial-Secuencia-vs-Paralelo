package paralelo;


// Solución recursiva, con n numeros

public class Main6 extends Thread{

	int size;
	long time;
	
	public Main6(int _size)
	{
		this.size = _size;
	}
	
	static long factorial_recursive(long n)
	{
		if (n == 0)
			return 1;
		return n * factorial_recursive(n-1);
	}
	
	public long time()
	{
		return this.time;
}
	
	public void run()
	{
		int i = 0;
		long start = System.nanoTime();
		while (i < size)
		{
			factorial_recursive(i);
			i++;
		}
		this.time = System.nanoTime()-start;
	}

	
}
