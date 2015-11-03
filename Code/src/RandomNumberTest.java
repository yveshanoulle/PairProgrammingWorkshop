import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import sun.nio.cs.Surrogate.Generator;


// Write a program that generates 100 random numbers between 1000 and
// 9999. Among the generated numbers find and display the number, which
// are "axially symmetric", which means that their records are of type XYYX


public class RandomNumberTest {

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void Contains_Hunderd_Numbers() {
		producer myProducer = new producer();
		
		assertEquals(100, myProducer.count());
		
	}

	@Test
	public void Is_Bigger_Then_1000() {
		producer myProducer = new producer();
		
		assertTrue(myProducer.number(0)>1000);
		
	}

	
}
