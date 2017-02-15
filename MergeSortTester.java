//Team MergeSort#1: Tiffany Moi, Brooke Jin, Irene Lam, Clive Johnston
//APCS2 pd5
//HW07 - What Does the Data Say?
//2017-02-15


/*======================================
  class MergeSortTester
  ALGORITHM:
  <INSERT YOUR DISTILLATION OF ALGO HERE>
  BIG-OH CLASSIFICATION OF ALGORITHM:
  <INSERT YOUR EXECUTION TIME CATEGORIZATION OF MERGESORT HERE>
  Mean execution times for dataset of size n:
  Batch size: <# of times each dataset size was run>
  n=1       time: 0.001
  n=10      time: 0.003
  n=100     time: 0.03
  n=1000    time: 0.208
  n=10000   time: 2.05
  n=100000  time: 19.23
  ANALYSIS:
  <INSERT YOUR RESULTS ANALYSIS HERE>
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
