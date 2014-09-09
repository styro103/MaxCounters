/*
 * Shaun Mbateng
 * Max Counters
 * This program keeps track of counters given an array of operations.
 * This program has an O(N+M) time complexity.
 */

import java.util.Arrays;
import java.util.Scanner;

public class MaxCounters 
{
	public static void main(String[] args) 
	{
		Scanner cin = new Scanner(System.in); //For inputs
		int [] A; //Array of Values
		int len; //Length of Array
		int N; //Number of Counters
		int [] Counts; //Array to Hold Counters
		Vect Counters = new Vect(); //Create New Vector of Counters
		
		//Enter Number of Counters
		System.out.print("Enter the Number of Counters: ");
		N = cin.nextInt();
		
		//Enter and Set Array Length
		System.out.print("Enter the Length of the Array: ");
		len = cin.nextInt();
		A = new int [len];
		
		//Fill Array
		for (int i=0; i<A.length; i++)
		{
			System.out.print("Enter Array Value "+(i+1)+": ");
			A[i] = cin.nextInt();
		}
			
		cin.close(); //Close cin, No Longer Needed
		
		//Call Function and Print Values
		Counts = Counters.getValues(N, A); //Variable isn't Needed if Just Calling Once
		System.out.println("\nCounters are "+Arrays.toString(Counts));
	}

}
