package JUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testaddstrings {

	@Test
	public void test() {
		Junitfunction junit= new Junitfunction();
		String result= junit.addStrings("software", "Engineering");
		assertEquals("softwareEngineering",result);
	}

}
