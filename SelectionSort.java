package linear;
import java.util.Arrays;

public class SelectionSort {
		
	public static void selectionsort(int[] array){
		for(int i = 0; i < array.length; i++){
			int minIndex = 1;
			for(int j = i + 1; j < array.length; j++){
				if(array[j] < array[minIndex])
					minIndex = j;
			}
			
			int temp = array[i];
			array[i] = array[minIndex];
			array[minIndex] = temp;
		}
	}
	
	public static void main(String[] args) {
		
		int[] array = {22, 10, 27, 33, 12, 14 ,19, 35};
		
		System.out.println("unsorted Array" + Arrays.toString(array));
		
		selectionsort(array);
		
		System.out.println("sorted Array" + Arrays.toString(array));
	}

}
