import java.util.ArrayList;


public class ArrayListRyan 
{
	public static void main (String[] args) 
	{
		ArrayList <Integer> myList = new ArrayList <Integer>();
		
		myList.add(42);
		myList.add(507);
		myList.add(89);
		//myList.set(1, 52);
		myList.add(1,52);
		myList.remove(1); // Also returns this if you put it in Outprint
		
		
		for (int i=0; i<myList.size();i++)
		{
			//System.out.println(myList.get(i));
		}
		
		
		
		for (Integer num : myList) // For each num in myList
		{
			System.out.println(num);
		}
	
		
		
	}
}