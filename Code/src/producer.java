import java.util.ArrayList;

public class producer {

	int MAX=100;
	
	int [] numbers;
	
	public producer()
	{
		numbers=new int [MAX];
		for(int counter=0; counter<MAX; counter++){
			numbers[counter]=4587;
       }
		
	}
	
	public int count()
	{	
		return numbers.length;
	}
	
	public int number(int index )
	{
		return numbers[index];
		
	}
	
	public ArrayList<Integer> AxiallySymetrics(int[] startNumbers ) throws numberTooSmallException,numberTooBigException 
	{
		ArrayList<Integer> resultNumbers = new ArrayList<Integer>();
		
		for (int intValue : startNumbers) 
		{
			if (IsAxiallySymetric(intValue))
			{
				resultNumbers.add(intValue);
			}
		}
		return resultNumbers;
	}

	public boolean IsAxiallySymetric(int numberToCheck) throws numberTooSmallException,numberTooBigException
	{
		int firstNumber;
		int secondNumber;
		int thirdNumber;
		int fourthNumber;
		String stringNumber;
		
		 if ( numberToCheck < 1001) 
		 {
				throw new numberTooSmallException ();
		 }	
		 if ( numberToCheck > 9999) 
		 {
				throw new numberTooBigException ();
		 }	
		 
		stringNumber=Integer.toString(numberToCheck);
		firstNumber=(int)stringNumber.charAt(0);
		secondNumber=(int)stringNumber.charAt(1);
		thirdNumber=(int)stringNumber.charAt(2);
		fourthNumber=(int)stringNumber.charAt(3);
		
		return (firstNumber==fourthNumber) && (secondNumber==thirdNumber);	
	}
}
