package paralelo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import com.panayotis.gnuplot.JavaPlot;

public class Simulacion {

	public static void main(String[] args) throws FileNotFoundException {
		
		int num = 20;
		long time;
		
		ArrayList<Main6> nFact = new ArrayList<Main6>();
		Main6 factorial;
		
		FileOutputStream os = new FileOutputStream("Time_threads.txt");
		PrintStream ps = new PrintStream(os);
		
		for (int i = 0; i<= num ; i++)
		{
			factorial = new Main6(i);
			nFact.add(factorial);
		}
		
		for (int i = 0; i< nFact.size(); i++)
		{
			nFact.get(i).start();
		}
		
		for (int i = 0; i < nFact.size();i++)
		{
			if(!nFact.get(i).isAlive())
			{
				ps.println(nFact.get(i).time());
			}
		}
		
		JavaPlot p = new JavaPlot("C:/Program Files/gnuplot/bin/gnuplot.exe");
		p.addPlot("\"Time_threads.txt\" with lines");
		p.plot();



	}

}
