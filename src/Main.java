/*
 * Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero. Print the decimal value of each fraction on a new line with 6 places after the decimal.
 * Example
 * 
 * arr = {1,1,0,-1,-1}
 * 
 * There are 5 elements, two positive, two negative and one zero. Their ratios are 2/5=0.400000, 2/5=0.400000 and 1/5= 0.200000. Results are printed as:
 * 0.400000
 * 0.400000
 * 0.200000
 * */

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) 
	{
		List<Integer> array = new ArrayList<Integer>();
		Integer[] ar = {-4,3,-9,0,4,1};
		
		for(int i = 0; i < ar.length;i++)
		{
			array.add(ar[i]);
		}
		 Result res = new Result();
		 
		 res.plusMinus(array);
		
	}

}
