import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
/**
 * 
 * @author Jose Anton, Alejandro Ortega, Pedro Pablo Guzmán
 * @version 1.0.0
 *
 */
class StackOperationsTest {
	StackVector sv = new StackVector<Integer>(); //Esta variable almacenara el stack que se usará para todas las pruebas
	@Test
	/**
	 * Este método prueba los métodos push y peek
	 */
	void PeekandPushMethodtest() {
		this.sv.push(4); //Se agrega un valor al stack
		int expectedvalue = 4; //Se agrega el valor esperado
		Assert.assertEquals(expectedvalue, this.sv.peek()); //Se hace la prueba
	}
	
	@Test
	/**
	 * Este método prueba el método pop
	 */
	void popTest() {
		this.sv.push(300);
		int expected = 300;
		Assert.assertEquals(expected, this.sv.pop());	
		
	}

}
