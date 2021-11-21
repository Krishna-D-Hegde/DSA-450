package Array;

import java.util.Arrays;
import java.util.Scanner;

import main.reusableMethods;

public class array001 {
	
	public static void main(String[] args) {
		reusableMethods rm = new reusableMethods();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int size = sc.nextInt();
		int[] arr = rm.intakeArray(size);
		int[] revArr = rm.reverseArray(arr);
		System.out.println("Input array - " + Arrays.toString(arr));
		System.out.println("Ouput array - " + Arrays.toString(revArr));
	}
	
	
}
