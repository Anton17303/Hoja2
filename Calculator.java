public class Calculator implements ICalculator {

    private Stack<Double> stack;
    private Double lastResult;

    public Calculator() {
        stack = new StackVector<Double>();
        lastResult = null;
    }

    @Override
    public double evaluate(String expression) throws ArithmeticException {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public double getPrevious() {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
