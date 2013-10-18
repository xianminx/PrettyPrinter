import junit.framework.Assert;

import org.junit.Test;

public class PrettyPrinterTest {

	@Test
	public void testNull() {
		String actual = PrettyPrinter.toString(null);
		System.out.println(actual);
		Assert.assertEquals("null", actual);
	}

	@Test
	public void testStaticClz() {
		String actual = PrettyPrinter.toString(TestClass.class);
		System.out.println(actual);
		Assert.assertTrue("PrettyPrint TestClass: "+actual,!"null".equals(actual));
	}
	
	@Test
	public void testObject() {
		String actual = PrettyPrinter.toString(new TestClass());
		System.out.println(actual);
		Assert.assertTrue("PrettyPrint TestClass: "+actual,!"null".equals(actual));
	}
	
	
	
}
