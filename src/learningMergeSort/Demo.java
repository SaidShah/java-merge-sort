package learningMergeSort;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {

		int unsortedArray[] = {25,36,95,28,45,125,2,999,78,19,325,769,652,854};

		System.out.println("Array before sorting "+Arrays.toString(unsortedArray));
		
		MergeSort.sorter(unsortedArray);
		
		System.out.println("Array after sorting "+Arrays.toString(unsortedArray));
		
	}

}
