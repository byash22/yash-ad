import java.util.Arrays;

public class IterativeSearchUnsorted {

	private static int data[] = {21,1,25,8,7,15,4,19,11};             //Unsorted Array
	
	public static int iterativeSearchUnsorted (int d[], int g) {
		int ndx = 0;
		Arrays.sort(data);                                            //Sorting by ascending order
		
	    
		while (ndx < d.length && d[ndx] < g) ndx++;    
		if (ndx >=d.length) return -1;
		if (d[ndx] == g) return ndx;
		else return -1;
	}	
	
	public static void main (String [] args) {
		int goal = 19;
		int result = iterativeSearchUnsorted(data, goal);
		if(result < 0)
			System.out.println("The search could not find: " + goal);
		else
			System.out.println("The goal of " + goal + " was found at index: " + result);
		
	}
}
