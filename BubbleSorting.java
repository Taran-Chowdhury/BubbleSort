package Sort;

import java.io.*;

public class BubbleSorting {

	/*
	 * Reads a file with integers and creates an array.
	 * Returns an array comprising of integers from the file read.
	 * 
	 * @Precondition  file consists data of type int.
	 * @param file  A file that consists of integers.
	 * @param aSize  The size of the array that needs to be created.
	 * @throws IOException  
	 * @throws FileNotFoundException  if file is not found.
	 * @return  an array of type int.
	 */
	public int[] ReadFile(File file, int aSize) throws IOException {
		int[] array = new int[aSize];
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			while (br.ready()) {
				for (int counter = 0; counter < aSize; counter++) {
					array[counter] = Integer.parseInt(br.readLine());
				}
			}
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		return array;
	}

	/*
	 * Sorts the given array using bubble sort method.
	 * compares adjacent pair of elements and swaps them if the first element
	 * is bigger than the second.
	 * repeats the process until array is sorted.
	 * prints "Array Sorted by bubble Sort!!!" after method is executed.
	 * 
	 * @param a  array of randomly sorted integers
	 * @param n  size of array.
	 * @Postcondition  is_sorted must be true.
	 */
	public void bubbleSort(int[] a, int n) {
		for (int i = 0; i < n; i++) {
			boolean is_sorted = true;
			for (int j = n - 1; j > 0; j--) {
				if (a[j] < a[j - 1]) {
					int temp = a[j - 1];
					a[j - 1] = a[j];
					a[j] = temp;
					is_sorted = false;
				}
			}
			if (is_sorted) {
				System.out.println("Array sorted by Bubble Sort!!!");
				return;
			}
		}
	}

	/*
	 * Prints the given array's elements horizontally.
	 * 
	 * @param a  an array that needs to be printed.
	 */
	public void printArray(int[] a) {

		System.out.println("This is the array:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
