package calculator;

public class Calc {
    public double calculate(Double num1, double num2, Operation op){
        return op.apply(num1, num2);
    }

}
