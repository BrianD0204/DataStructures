import java.util.Arrays;

public class MergeSort {
	
	public static void merge(int[]array, int i, int j, int k){
		
		int mergedSize = k - i + 1;
		int mergePos = 0;
		int leftPos = i;
		int rightPos = j + 1;
		
		int[] mergedArray = new int[mergedSize];
		
		while(leftPos <= j && rightPos <= k){
			//comparison goes here and decending and acending change below
			if(array[leftPos] < array[rightPos]){
				mergedArray[mergePos] = array[leftPos];
				leftPos++;
			}
			else{
				mergedArray[mergePos] = array[rightPos];
				rightPos++;
			}
			mergePos++;
		}
		
		while(leftPos <= j){
			mergedArray[mergePos] = array[leftPos];
			leftPos++;
			mergePos++;
		}
		while(rightPos <= k){
			mergedArray[mergePos] = array[rightPos];
			rightPos++;
			mergePos++;
		}
		
		for(mergePos = 0; mergePos < mergedSize; mergePos++){
			array[i + mergePos] = mergedArray[mergePos];
		}
	}
	
	public static void mergeSort (int[]array, int i, int k){
		
		if(i < k){
			int j = (i+k)/2;
			
			mergeSort(array, i, j);
			mergeSort(array, j + 1, k);
			
			merge(array,i, j, k);
		}
	}

	public static void main(String[] args) {
		
		int[] array = {22, 10, 27, 33, 12, 14 ,19, 35};
		//int[]array = {1, 2, 3, 4, 5, 6, 7, 8};
		
		System.out.println("Unsorted Array " + Arrays.toString(array));
		
		mergeSort(array, 0, array.length - 1);
		
		System.out.println("Sorted Array " + Arrays.toString(array));
	}

}
