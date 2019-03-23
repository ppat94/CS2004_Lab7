import java.util.ArrayList;
import java.util.Random;


public class Lab7 {

	public static void main(String[] args)
	{
		/*
		 * 7.2 Exercise 1: Preliminaries
		 */
		double graph1[][] = {{0,1,2},{1,0,3},{2,3,0}};
		double graph2[][] = {{0,1,2,3,0},{1,0,6,0,5},{2,6,0,4,1},{3,0,4,0,2},{0,5,1,2,0}};
		System.out.println("Matrix G: ");
		printArray(graph1);
		System.out.println("\nMST (Matrix G): ");
		double mst[][] = MST.PrimsMST(graph1);
		printArray(mst);

		/*
		 * 7.3 Exercise 2: A larger example
		 */
		System.out.println("\nMatrix E: ");
		printArray(graph2);
		System.out.println("\nMST (Matrix E): ");
		double mst1[][] = MST.PrimsMST(graph2);
		printArray(mst1);

		/*
		 * 7.4 Exercise 3: Experimental Analysis
		 */
		System.out.println();
		printArray(randomArray(3));

	}

	private static double[][] randomArray(int n)
	{
		Random rand = new Random();
		double[][] outArray = new double[n][n];
		rand.setSeed(System.currentTimeMillis());

		for (int row = 0; row < n; row++)
		{
			for (int col = 0; col < n; col++)
			{
				double r = Math.abs(rand.nextInt() % 101);
				outArray[row][col] = r;
				outArray[0][row] = outArray[row][0];
				//outArray[1][2] = outArray[2][1];
			}
		}
		return outArray;
	}

	public static void printArray(double g[][])
	{
		for (int row = 0; row < g.length; row++)
		{
			for (int col = 0; col < g[row].length; col++)
			{
				System.out.print(g[row][col] + " ");
			}
			System.out.println();
		}
	}

}
