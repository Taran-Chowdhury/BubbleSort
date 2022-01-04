package Sort;

import java.io.File;
import java.io.IOException;

public class BubbleSortTester {

	/*
	 * create new instance of BubbleSorting
	 * read a file with data of type int and pass into array.
	 * sort the data and print sorted array.
	 */
	public static void main(String[] args) throws IOException {
		BubbleSorting bS = new BubbleSorting();
		File file = new File(
				"C:\\Users\\taran\\Desktop\\CS146\\HW2 - Iterataive sorting\\BubbleSorter\\bin\\arr1-2.txt");
		int[] BSarr = bS.ReadFile(file, 50);
		bS.bubbleSort(BSarr, 50);
		bS.printArray(BSarr);
	}
}
