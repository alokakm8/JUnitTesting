package JUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testaddNumbers {

	@Test
	public void test() {
		Junitfunction junit= new Junitfunction();
		int result =junit.addNumbers(101, 200);
		assertEquals(301,result);
	}

}
