package cviceni;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Ukol2Test {

	StringBuilder sb;
	//StringBuffer sb;
	
	@BeforeClass
	public void init(){
		sb = new StringBuilder();
		//sb = new StringBuffer();
	}
	
	@Test(dataProvider = "kratProvider")
	public void testKrat(int a, int b, int expected) {
		Assert.assertEquals(Ukol2.krat(a,b),expected);
	}

	@DataProvider(name = "kratProvider") 
	public Object[][] provideKrats() { 
		return new Object[][] { 
				{2, 3, 6},
				{0, 3, 0},
				{-1, -1, 1},
				{1000000000, 1, 1000000000}
		};
	}
	
	@Test(threadPoolSize = 50, invocationCount = 100)
	public void testThreadSafe1() {
		String msg = sb.toString();
		sb.append('a');
		Assert.assertEquals(sb.toString(), msg + "a");
		sb.append('b');
		Assert.assertEquals(sb.toString(), msg + "ab");
		sb.append('c');
		Assert.assertEquals(sb.toString(), msg + "abc");
	}
	
	@Test(threadPoolSize = 50, invocationCount = 100)
	public void testThreadSafe2() {
		String msg = sb.toString();
		sb.append('b');
		Assert.assertEquals(sb.toString(), msg + "b");
		sb.append('a');
		Assert.assertEquals(sb.toString(), msg + "ba");
		sb.append('d');
		Assert.assertEquals(sb.toString(), msg + "bad");
	}
}