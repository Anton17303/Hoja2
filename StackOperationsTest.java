import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class StackOperationsTest {
	StackVector sv = new StackVector<Integer>();
	int expectedvalue = 4;
	@Test
	void PeekandPushMethodtest() {
		this.sv = new StackVector<Integer>();
		sv.push(4);
		this.expectedvalue = 4;
		Assert.assertEquals(expectedvalue, sv.peek());
	}
	
	@Test
	void popTest() {
		this.sv.push();
		
	}

}
