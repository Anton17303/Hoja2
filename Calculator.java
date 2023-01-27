import java.util.ArrayList;

public class Calculator implements ICalculator {

    //private Stack<Double> stack;
    private Double lastResult; //Esta variable guarda el resultado de la última operación realizada
    
	private int operationCounter =0; //Esta variable sirve para contar las operaciones efectuadas con el métdo evaluate

    @Override
    public double evaluate(String expression) throws ArithmeticException {
    	//pre: expression es un string el cuál representa una expresión aritmetica en notación postfiz
    	//post: se devuelve el resultado de la operación postfix ingresada, si hay una operación no válida se retornara un valor negativo
    	try {
    		Stack<Double> stack = new StackVector<Double>();
 
    		this.operationCounter +=1;
    		String[] characters = expression.split("\s");
    		for (int i=0; i<characters.length; i++) {
    			if (Character.isDigit(characters[i])){
    				
    			}
    		}
    		return 0;
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
