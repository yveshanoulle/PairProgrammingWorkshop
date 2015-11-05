import java.util.ArrayList;

public class producer {

	public int count()
	{	
		return 100;
	}
	
	public int number(int index )
	{
		return 4587;
		
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
