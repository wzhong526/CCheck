package checkdigit;

import static org.junit.Assert.*;

import org.junit.Test;

public class CCheckUnitTest extends CheckDigit {
	public void testisValid(){
		isValid(4246345689049834);
		assertEquals(false,isValid(4246345689049834));
	}
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
