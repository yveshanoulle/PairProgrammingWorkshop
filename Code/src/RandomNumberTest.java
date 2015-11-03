import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import sun.nio.cs.Surrogate.Generator;


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

	
}
