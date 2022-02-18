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
