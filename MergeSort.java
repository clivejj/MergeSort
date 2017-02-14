//Tiffany Moi
//APCS2 pd5
//HW#06 -- Step 1: Split, Step 2: ?, Step 3: Sorted!
//2017-02-12

/*======================================
  class MergeSort
  Implements mergesort on array of ints.
  Summary of Algorithm: Split the given array in half until
  you get two arrays of length 1. Merge these two arrays and the ones 
  preceding them until you merge the final two large arrays into the 
  desired sorted array.
  ======================================*/

public class MergeSort {

    /******************************************************
     * int[] merge(int[],int[]) 
     * Merges two input arrays
     * Precond:  Input arrays are sorted in ascending order
     * Postcond: Input arrays unchanged, and 
     * output array sorted in ascending order.
     ******************************************************/
    private static int[] merge( int[] a, int[] b ) 
    {
	int[] ret = new int[a.length+b.length];
	int i = 0;
	int j = 0;
	int r = 0;
	while (i < a.length && j < b.length && r < ret.length){
	    if (a[i] < b[j]){
		ret[r]=a[i];
		i ++;
		    
	    }
	    else {
		ret[r]=b[j];
		j ++;
	    }
	    r ++;
	}
	if (r != ret.length){
	    if (i != a.length){
		while (i < a.length){
		    ret[r]=a[i];
		    r ++;
		    i ++;
		}
	    }
	    else{
		while (j < b.length){
		    ret[r]=b[j];
		    r ++;
		    j ++;
		}
	    }
	}
	return ret;
	      
    }//end merge()


    /******************************************************
     * int[] sort(int[]) 
     * Sorts input array using mergesort algorithm
     * Returns sorted version of input array (ascending)
     ******************************************************/
    public static int[] sort( int[] arr ) 
    {
	int[] a;
	int[] b; 
	if (arr.length == 1){
	    return arr;
	}
	else {
	    int i = arr.length / 2;
	    a = new int[i];
	    b = new int[arr.length - i];
	    for (int x = 0; x < i; x ++){
		a[x] = arr[x];
	    }
	    for (int x = i; x < arr.length; x ++){
		b[x-i] = arr[x];
	    }
	    return merge(sort(a), sort(b));
	}
    }//end sort()



    //-------------------HELPERS-------------------------
    //tester function for exploring how arrays are passed
    //usage: print array, mess(array), print array. Whaddayasee?
    public static void mess( int[] a ) {
	for( int i = 0 ; i<a.length; i++ )
	    a[i] = 0;
    }

    //helper method for displaying an array
    public static void printArray( int[] a ) {
	System.out.print("[");
	for( int i : a )
	    System.out.print( i + ",");
	System.out.println("]");
    }
    //---------------------------------------------------


    //main method for testing
    public static void main( String [] args ) {

	
	  int[] arr0 = {0};
	  int[] arr1 = {1};
	  int[] arr2 = {1,2};
	  int[] arr3 = {3,4};
	  int[] arr4 = {1,2,3,4};
	  int[] arr5 = {4,3,2,1};
	  int[] arr6 = {9,42,17,63,0,512,23};
	  int[] arr7 = {9,42,17,63,0,9,512,23,9};
	  System.out.println("\nTesting mess-with-array method...");
	  printArray( arr3 );
	  mess(arr3);
	  printArray( arr3 );
	  System.out.println("\nMerging arr1 and arr0: ");
	  printArray( merge(arr1,arr0) );
	  System.out.println("\nMerging arr4 and arr6: ");
	  printArray( merge(arr4,arr6) );
	  System.out.println("\nSorting arr4-7...");
	  printArray( sort( arr4 ) );
	  printArray( sort( arr5 ) );
	  printArray( sort( arr6 ) );
	  printArray( sort( arr7 ) );

    }//end main()

}//end class MergeSort
