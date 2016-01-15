import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

// Write a program that generates 100 random numbers between 1000 and
// 9999. Among the generated numbers find and display the number, which
// are "axially symmetric", which means that their records are of type XYYX

public class RandomNumberTest {
	Producer myProducer;

	@Before
	public void setUp() throws Exception {
		myProducer = new Producer();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void ContainsHunderdNumbers() {
		assertEquals(100, myProducer.count());
	}

	@Test
	public void IsBiggerThen1000() {
		assertTrue(myProducer.number(0) > 1000);
	}

	@Test
	public void IsSmallerThen9999() {
		assertTrue(myProducer.number(0) < 9999);
	}

	@Test
	public void OnlyReturnsAxiallySymmetricNumbers() throws NumberTooSmallException, NumberTooBigException {
		int[] startNumbers = { 1458, 4587, 1441, 6996 };
		ArrayList<Integer> resultNumbers = myProducer.AxiallySymetrics(startNumbers);
		assertTrue(resultNumbers.size() == 2);

	}

	@Test
	public void oneFourFouroneIsAxiallySymmetric() throws NumberTooSmallException, NumberTooBigException {
		assertTrue(myProducer.isAxiallySymetric(1441));
	}

	@Test
	public void oneTwoThreeFourIsNotAxiallySymmetric() throws NumberTooSmallException, NumberTooBigException {
		assertFalse(myProducer.isAxiallySymetric(1234));
	}

	@Test()
	public void oneTwoThreeoneIsNotAxiallySymmetric() throws NumberTooSmallException, NumberTooBigException {
		assertFalse(myProducer.isAxiallySymetric(1231));
	}

	@Test()
	public void oneTwoTwoThreeIsNotAxiallySymmetric() throws NumberTooSmallException, NumberTooBigException {
		assertFalse(myProducer.isAxiallySymetric(1223));
	}

	@Test(expected = NumberTooSmallException.class)
	public void oneFourOneIsTooSMall() throws NumberTooSmallException, NumberTooBigException {
		myProducer.isAxiallySymetric(141);
	}

	@Test(expected = NumberTooBigException.class)
	public void oneFourOneIsTooBig() throws NumberTooSmallException, NumberTooBigException {
		myProducer.isAxiallySymetric(14541);
	}
}
