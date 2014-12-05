package cviceni;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Ukol1Test {

	@Test(groups = "working")
	public void testFaktorial1() {
		Assert.assertEquals(Ukol1.faktorial(0), 1);
		Assert.assertEquals(Ukol1.faktorial(1), 1);
	}

	@Test(groups = {"todo", "working"})
	public void testFaktorial2() {
		throw new UnsupportedOperationException("Zatim neimplementovano");
	}

	@Test(groups = {"todo", "working"})
	public void testFaktorial3() {
		throw new UnsupportedOperationException("Zatim neimplementovano");
	}

	@Test(expectedExceptions=IllegalArgumentException.class, groups = "working")
	public void testFaktorial4() {
		Assert.assertEquals(Ukol1.faktorial(-1), 0);
	}
}
