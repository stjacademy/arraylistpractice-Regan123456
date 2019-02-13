import java.util.ArrayList;

public class MiniLabs {

	public static void main(String[] args) 
	{	
		ArrayList <Integer> factored = new ArrayList <Integer>();
		factored.add(2);
		factored.add(6);
		factored.add(19);
		factored.add(24);
		factored.add(23);
		factored.add(3);
		factored.add(38);
		factored.add(27);
		factored.add(49);
		factored.add(63);
		factored.add(10);
		factored.add(302);
		
		System.out.print(getListOfFactors(204));
		System.out.print(factored);
		keepOnlyCompositeNumbers(factored);
	}
		  public static ArrayList <Integer> getListOfFactors(int number)
		  {                                                     
			ArrayList <Integer> nums = new ArrayList<Integer>();
			
			for (int i = 1; i <= number;i++)
			{
				if (number % i == 0)
					nums.add(i);
			}
			return nums;
		  }
		  
		  public static void keepOnlyCompositeNumbers(ArrayList<Integer> nums)
		  {
			for (int i = nums.size()-1; i > 0; i--)
			{
				if (getListOfFactors(nums.get(i)).size() <= 2)
				{
					nums.remove(i);
				}
			}
			System.out.print(nums);
		  }
	}

