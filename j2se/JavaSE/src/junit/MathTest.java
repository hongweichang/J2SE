package junit;

import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.Test;

public class MathTest {

	@Test
	public void testDiv() {
		TestCase.assertEquals(new Math().div(10, 3), 5,1);
	}

}
