import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class StackOperationsTest {

	@Test
	void PeekMethodtest() {
		StackVector sv = new StackVector<Integer>();
		sv.push(4);
		int expectedvalue = 4;
		Assert.assertEquals(expectedvalue, sv.peek());
	}

}
