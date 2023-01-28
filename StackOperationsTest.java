import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class StackOperationsTest {
	StackVector sv = new StackVector<Integer>();
	@Test
	void PeekandPushMethodtest() {
		this.sv = new StackVector<Integer>();
		sv.push(4);
		int expectedvalue = 4;
		Assert.assertEquals(expectedvalue, sv.peek());
	}
	
	@Test
	void popTest() {
		this.sv.push(300);
		int expected = 300;
		Assert.assertEquals(expected, this.sv.pop());
		
		
	}

}
