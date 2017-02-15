# MergeSort
Brooke Jin, Clive Johnston, Irene Lam, Tiffany Moi

[Graph of Execution Times](https://docs.google.com/document/d/1fVFtD0B56JS_kOiJJNEwSu4c7OESdZWC3MSvdyWRB3U/pub)

# Summary of Algorithm
MergeSort:
Mergesort accepts an array and proceeds to recursively divide the array in half. When an array has length 1, the array is then combined and sorted with the array that also came from the same "mother" array (the array that divided the produce the two aforementioned arrays), until only one array remains (the sorted version of the original array).

MergeSortTester:
Through the use of numerous 2D arrays, MergeSortTester tests the speed (in milliseconds) of an array of size 1, 10, 100, 1000, 10000, and 100000 a total of 1000 times and divides the time result by 1000 in order to get a largely accurate average time per size.

# Findings
We deduced that MergeSort runs in O(nlogn) time based on the results of our time compilations and corresponding graphs.
