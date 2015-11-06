import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;



// Write a program that generates 100 random numbers between 1000 and
// 9999. Among the generated numbers find and display the number, which
// are "axially symmetric", which means that their records are of type XYYX


public class RandomNumberTest {
	producer myProducer;
	
	@Before
	public void setUp() throws Exception {
		myProducer = new producer();
	}
	@After
	public void tearDown() throws Exception {
	}
	@Test
	public void Contains_Hunderd_Numbers() {
				
		assertEquals(100, myProducer.count());
		
	}
	@Test
	public void Is_Bigger_Then_1000() {
		
		assertTrue(myProducer.number(0)>1000);
		
	}
	@Test
	public void Is_Smaller_Then_9999() {
		
		assertTrue(myProducer.number(0)<9999);
		
	}
	@Test
	public void Only_Returns_Axially_Symmetric_Numbers() throws numberTooSmallException,numberTooBigException{
		
		int[] startNumbers = {1458,4587,1441,6996};
		
		ArrayList<Integer> resultNumbers=myProducer.AxiallySymetrics(startNumbers);
		
		assertTrue(resultNumbers.size() ==2);
		
		
	}
	@Test
	public void OneFourFourOne_Is_Axially_Symmetric() throws numberTooSmallException,numberTooBigException{
		assertTrue(myProducer.IsAxiallySymetric(1441));	
	}
	@Test
	public void OneTwoThreeFour_Is_Not_Axially_Symmetric() throws numberTooSmallException,numberTooBigException{
		assertFalse(myProducer.IsAxiallySymetric(1234));	
	}
	@Test ()
	public void OneTwoThreeOne_Is_Not_Axially_Symmetric()throws numberTooSmallException ,numberTooBigException{
		assertFalse(myProducer.IsAxiallySymetric(1231));	
	}
	@Test ()
	public void OneTwoTwoThree_Is_Not_Axially_Symmetric() throws numberTooSmallException,numberTooBigException{
		assertFalse(myProducer.IsAxiallySymetric(1223));	
	}
	@Test(expected = numberTooSmallException.class) 
	public void OneFourOne_Is_TooSMall() throws numberTooSmallException,numberTooBigException {
		myProducer.IsAxiallySymetric(141);	
	}
	@Test(expected = numberTooBigException.class) 
	public void OneFourOne_Is_TooBig() throws numberTooSmallException,numberTooBigException {
		myProducer.IsAxiallySymetric(14541);	
	}
}
