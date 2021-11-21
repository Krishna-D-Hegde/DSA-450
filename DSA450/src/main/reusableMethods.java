package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class reusableMethods {
	
	/**
	 * Method to return reversed integer array
	 * @param arr
	 * @return
	 */
	public int[] reverseArray(int arr[]) {	
		int size = arr.length;						//size of the array
		int[] revArr = new int[size];				//array to store reversed array
		int count = 0;
		for (int i=size-1; i>=0; i--) {
			revArr[count] = arr[i];
			count++;
		}
		return revArr;
	}
	
	/**
	 * This method takes integer array input from the user
	 * @param size
	 * @return
	 */
	
	public int[] intakeArray(int size) {
		System.out.println("Please enter the values of the array: ");
		Scanner sc = new Scanner(System.in);
		int[] inputArray = new int[size];
		for(int i=0; i<size; i++) {
			inputArray[i]= sc.nextInt();
		}
		return inputArray;
		
	}
	
	/**
	 * This method returns the maximum of an Integer array
	 * @param arr
	 * @return
	 */
	public int maxOfIntArray(int[] arr) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		for(int m:arr) {
			a1.add(m);
		}
		int max = (int)Collections.max(a1);		
		return max;
	}
	
	/**
	 * This method returns the minimum of an Integer array
	 * @param arr
	 * @return
	 */
	public int minOfIntArray(int[] arr) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		for(int m:arr) {
			a1.add(m);
		}
		int min = (int)Collections.min(a1);		
		return min;
	}
}
