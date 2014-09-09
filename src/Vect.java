/*
 * The class and function to solve for and return counter values.
 * This runs in O(N+M).
 */

import java.util.Arrays; //To Use Less Lines for Arrays

class Vect
{
    public int [] getValues(int N, int[] A) //Function to Return Counters
    {
        int [] counters = new int [N]; //Array to Hold Counters
        int max = 0; //Array to Keep Track of Max Value
        //Arrays.fill(counters, 0); //In Java, Array is Automatically be Filled With Zeros
        
        //Edge Case
        if (A[0] == N+1) //If First Element is Max_Counter Operation
        {
            //Check If All Operation are Max_Counter
        	boolean mc = true; 
            
            for (int i=1; i<A.length; i++) //Loop Through Array of Operations
            {
                if (A[i] != A[0]) //If Current Element is Not Max_Counter
                {
                    mc = false; //Set Boolean to False
                    break; //Leave Loop
                }
            }
                
            if (mc == true) //If All Max_Counters
                return counters; //Return Array as is
        }
        
        for (int K=0; K<A.length; K++) //Loop Through Operations
        {
            if (A[K] == (N+1)) //If Max_Counter
                Arrays.fill(counters, max); //Fill Array Current Max Value
            else
            {
                int temp = ++counters[A[K]-1]; //Increment Counter, Store in Temp
                
                if (temp>max) //Compare temp and max
                    max = temp; //Change is max is Smaller
            }
        }
        
        return counters; //Return counters
    }
}