import java.util.Arrays;

public class InsertionSort {
	
	public static void insertionSort(int [] array) {
		
		int j = 0;
		int temp = 0;
		
		for(int i = 1; i < array.length; i++)
		{
			j = i;
			while(j > 0 && array[j] < array[j - 1])
			{
				temp = array[j];
				array[j] = array[j - 1];
				array[j - 1] = temp;
				j--;
			}
		}
	}

	public static void main(String[] args) {
		
		int[] array = {22, 10, 27, 33, 12, 14 ,19, 35};
		//int[]array = {1, 2, 3, 4, 5, 6, 7, 8};
		
		System.out.println("Unsorted Array " + Arrays.toString(array));
		
		insertionSort(array);
		
		System.out.println("Sorted Array " + Arrays.toString(array));
	}

}
