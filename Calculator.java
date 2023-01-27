import java.util.ArrayList;
/**
 * 
 * @author José Anton, Alejandro Ortega, Pedro Pablo Guzmán
 *
 */
public class Calculator implements ICalculator {

    //private Stack<Double> stack;
    private Double lastResult; //Esta variable guarda el resultado de la última operación realizada
    
	private int operationCounter =0; //Esta variable sirve para contar las operaciones efectuadas con el métdo evaluate

	/**
	 * Este metodo evalua una expresión en notación postfix y devuelve el resultado de la expresión
	 * @param expression la expresión a ser evaluada
	 * @returns devuelve el resultado de la expresión en notación postfix
	 */
    public double evaluate(String expression) throws ArithmeticException {
    	//pre: expression es un string el cuál representa una expresión aritmetica en notación postfiz
    	//post: se devuelve el resultado de la operación postfix ingresada, si hay una operación no válida se retornara un valor negativo
    	try {
    		Stack<Double> stack = new StackVector<Double>(); //esta variable almacena el stack que se usará para realizar las operaciones
    		String[] characters = expression.split("\s");
    		for (int i=0; i<characters.length; i++) {
    			if (Character.isDigit(characters[i].charAt(0))){
    				stack.push(Double.valueOf(characters[i]));
    			}
    			else {
    				Double firstNum = stack.pop();
    				Double secondnumb = stack.pop();
    				switch(characters[i]) {
    					
    					case "+":
    						stack.push(firstNum+ secondnumb);
    						break;
    					case "-":
    						stack.push(firstNum- secondnumb);
    						break;
    					case "*":
    						stack.push(firstNum* secondnumb);
    						break;
    					case "/":
    						stack.push(firstNum- secondnumb);
    						break;
    					
    				}
    			}
    		}
    		this.operationCounter +=1; //Sumar 1 si se utiliza evaluate
    		return stack.peek();
    	}
    	catch (Exception e){
    		return -1.0;
    	}

    }

    @Override
    public double getPrevious() {

    	//post: regresa el valor de la última operación realizada si el valor de operationCounter no es cero, de lo contrario, regresa un valor negativo
    	double res =0.0;
		if (this.operationCounter != 0) {
			res = this.lastResult;
		}
		else {
			res = -1.0;
		}
		return res;
		
    }
    
}
