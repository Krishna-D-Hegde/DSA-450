package Array;

import java.util.Arrays;

public class array1 {
	
	public static void main(String[] args) {
		int[] arr = {5,9,3,4,7,8,1,2};				//input array
		int[] revArr = reverseArray(arr);
		System.out.println("Input array - " + Arrays.toString(arr));
		System.out.println("Ouput array - " + Arrays.toString(revArr));
	}
	
	/**
	 * Method to return reversed array
	 * @param arr
	 * @return
	 */
	public static int[] reverseArray(int arr[]) {	
		int size = arr.length;						//size of the array
		int[] revArr = new int[size];				//array to store reversed array
		int count = 0;
		for (int i=size-1; i>=0; i--) {
			revArr[count] = arr[i];
			count++;
		}
		return revArr;
	}
	
}
