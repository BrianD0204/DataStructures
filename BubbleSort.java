//Brian Dass

import java.util.Arrays;

public class BubbleSort {
	
	public static void bubblesort(int[]array){
		
		int comparison = 0;
		boolean flag;
		
		for(int i = 0; i < array.length - 1; i++)
		{
			flag = false;
			for(int j = 0; j < array.length - i - 1; j++)
			{
				comparison++;
				if(array[j] > array[j+1])
				{
					int temp = array[j];
					array[j]=array[j + 1];
					array[j + 1] = temp;
					flag = true;
				}
			}
			
			if(flag == false)
				break;
		}
		
		System.out.println ("Number of compariosns " + comparison);
	}

public static void main(String[] args) {
		
		int[] array = {22, 10, 27, 33, 12, 14 ,19, 35};
		//int[]array = {1, 2, 3, 4, 5, 6, 7, 8};
		
		System.out.println("Unsorted Array " + Arrays.toString(array));
		
		bubblesort(array);
		
		System.out.println("Sorted Array " + Arrays.toString(array));
	}

}
