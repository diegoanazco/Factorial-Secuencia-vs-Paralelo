package secuencial;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import com.panayotis.gnuplot.JavaPlot;

// Solución recursiva, con n numeros

public class Main5 {
	
	static long factorial_recursive(long n)
	{
		if (n == 0)
			return 1;
		return n * factorial_recursive(n-1);
	}

	static long n_numeros(int x)
	{
		int i = 0;
		long start = System.nanoTime();
		while (i < x)
		{
			factorial_recursive(i);
			i++;
		}
		
		return System.nanoTime() - start;
	}
	
	public static void main(String[] args) throws FileNotFoundException
	{
		int num = 20;
		
		FileOutputStream os = new FileOutputStream("Times.txt");
		PrintStream ps = new PrintStream(os);
		
		for (int i = 0; i <= num; i++)
		{
			ps.println(n_numeros(i));
		}
		
		JavaPlot p = new JavaPlot("C:/Program Files/gnuplot/bin/gnuplot.exe");
		p.addPlot("\"Times.txt\" with lines");
		p.plot();

	}
}
