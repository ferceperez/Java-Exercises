import java.util.Collections;
import java.util.List;

public class Result 
{
	public void plusMinus(List<Integer> array) 
	{
		
		float size = array.size();
		
		
		float pos = 0;
		
		float neg = 0;
		
		float zero = 0;
		
		float pratio, nratio, zratio;
		
		for(int i = 0; i < array.size();i++)
		{
			if(array.get(i) > 0)
			{
				pos++;
			}
			else if(array.get(i) < 0)
			{
				neg++;
			}
			else
			{
				zero++;
			}
		}
		
		pratio = pos/size;
		nratio = neg/size;
		zratio = zero/size;
		
		System.out.printf("%.6f", pratio);
		System.out.print("\n");
		System.out.printf("%.6f", nratio);
		System.out.print("\n");
		System.out.printf("%.6f", zratio);
		
		
		
	}
	
	public void MiniMax(List<Integer> arr)
	{
		int size = arr.size();
	      
		 long min = 0;
		long max = 0;
	      
	      Collections.sort(arr);
	      
	      for(int i = 0; i< size-1; i++)
	      {
	          min = min+arr.get(i);
	      }
	      for(int i = 1; i< size; i++)
	      {
	          max = max+arr.get(i);
	      }
	      
	      System.out.println(min +" "+ max);
		
		
	}
}
