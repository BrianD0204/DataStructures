package linear;

import java.util.Scanner;

public class binarysearch {
	public static int binarySearch(String[] array, String key){
		int low = 0;
		int high = array.length - 1;
		
		while(high>= low){
			int mid = (low + high)/2;
			
			if(array[mid].compareTo(key)>0){
				high = mid-1;	
			} else if (array[mid].compareTo(key)<0){
				low = mid - 1;
			}else{
				return mid;
			}
		}
		return -1;
	}
			
	
	
	public static void main(String[] args){
		String[] array ={"Amy","Bob", "Chris", "Holly", "Ray", "Sarah","Zoe"};
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the key:");
		String key = scan.next();
		
		int index = binarySearch(array, key);
		
		if(index == -1)
			System.out.println("The item is not found");
		else
			System.out.println("The item is found at " + index);
	}
}
	