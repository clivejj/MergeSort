//Team MergeSort#1: Tiffany Moi, Brooke Jin, Irene Lam, Clive Johnston
//APCS2 pd5
//HW07 - What Does the Data Say?
//2017-02-15


/*======================================
  class MergeSortTester
  ALGORITHM:
  MergeSortTester creates 2D arrays with a constant 1000 rows and varying column length (1, 10, 100, 1000, 10000, 100000) to test the 
  speed (in milliseconds) of an array of size 1, 10, 100, 1000, 10000, and 100000 a total of 1000 times. It proceeds to divide the time 
  result by 1000 in order to arrive at the average time per size of the array (column length) that MergeSort sorts.
  
  BIG-OH CLASSIFICATION OF ALGORITHM:
  O(nlogn)
  Mean execution times for dataset of size n:
  Batch size: 1000
  n=1       time: 0.001 ms
  n=10      time: 0.003 ms
  n=100     time: 0.03 ms
  n=1000    time: 0.208 ms 
  n=10000   time: 2.05 ms
  n=100000  time: 19.23 ms
  
  ANALYSIS:
  Based on the curve of the above data when graphed, the algorithm most closely resembles a run time of nlogn, hence reaffirming our speculations.
  Note: The small sample size, limited number of n trials, the lack of corresponding algorithms for O(n), O(n^2), and like classifications
  may make our time justification somewhat unreliable. 
  
  ======================================*/

public class MergeSortTester 
{

    //tester method for testing runTime of array of length n
    public static double tester(int n) {

	//create 2D array for testing of length 1000 x n
	int[][] tester = new int[1000][n];
	for (int i = 0; i < tester.length; i++) {
	    for (int j = 0; j < tester[i].length; j++) {
		tester[i][j] = (int) (Math.random() * 1000);
	    }
	}

	//get start time
	long startTime = System.currentTimeMillis();
	//System.out.println(startTime);

	//sort every array
	for (int[] arr : tester) {
	    MergeSort.sort(arr);
	}

	//get end time
	long endTime = System.currentTimeMillis();
	//System.out.println(endTime);

	//return average time
	//System.out.println(endTime - startTime);
	return (double)(endTime - startTime) / 1000.0;
    }

	
    
    

    /******************************
     * execution time analysis: 
     * Runs the tester function which
     * generates 1000 arrays of the desired
     * length n. Averages the runtime of each array
     * of length n at the end and returns the average.
     ******************************/
    public static void main( String[] args ) 
    {
	System.out.println(tester(1));
	System.out.println(tester(10));
	System.out.println(tester(100));
	System.out.println(tester(1000));
	System.out.println(tester(10000));
	System.out.println(tester(100000));
    }//end main

}//end class
