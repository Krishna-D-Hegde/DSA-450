package Array;

import java.util.Scanner;

import main.reusableMethods;

public class array002 {
	public static void main(String[] args) {
		reusableMethods rm = new reusableMethods();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int size = sc.nextInt();
		int[] arr = rm.intakeArray(size);
		System.out.println("Maximum value of the array is: " + rm.maxOfIntArray(arr));
		System.out.println("Minimum value of the array is: " + rm.minOfIntArray(arr));
		
	}
	
}
