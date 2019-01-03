package learningMergeSort;

public class MergeSort {

	public static void sorter(int inputArray[]) {
		sort(inputArray, 0, inputArray.length - 1);
	}

	public static void sort(int inputArray[], int start, int end) {

		if (end <= start) {
			return;// done traversing the array
		}

		int midpoint = (start + end) / 2;
		sort(inputArray, start, midpoint);// sort the left half
		sort(inputArray, midpoint + 1, end);// sort the right half
		merge(inputArray, start, midpoint, end);// merge sorted results into the input array
	}

	public static void merge(int inputArray[], int start, int midpoint, int end) {

		int tempArray[] = new int[end - start + 1];

		int leftStartingIndex = start;// index counter for the left side of the array
		int rightStartingIndex = midpoint + 1;// index counter for the right side of the array
		int newCounter = 0;

		while (leftStartingIndex <= midpoint && rightStartingIndex <= end) {
			if(inputArray[leftStartingIndex]<inputArray[rightStartingIndex]) {
				tempArray[newCounter] = inputArray[leftStartingIndex];
				leftStartingIndex++;
			}else {
				tempArray[newCounter] = inputArray[rightStartingIndex];
				rightStartingIndex++;
			}
			newCounter++;
		}
		
		//when it gets here that means the loop is completed  so both the right and left sides 
		// are sorted into separate sub arrays
		
		if(leftStartingIndex<=midpoint) {// consider the right side being done sorted and left must be sorted already
			while(leftStartingIndex<=midpoint) {
				tempArray[newCounter] = inputArray[leftStartingIndex];
				leftStartingIndex++;
				newCounter++;
			}
		}else if(rightStartingIndex<=end) {
			while(rightStartingIndex<=end) {
				tempArray[newCounter] = inputArray[rightStartingIndex];
				rightStartingIndex++;
				newCounter++;
			}
		}
		
		// copy the temporary array into the appropriate slots of the input array
		for(int i =0;i<tempArray.length;i++) {
			inputArray[start+i] = tempArray[i];
		}
	}

}

























