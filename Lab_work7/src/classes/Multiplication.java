package classes;

import interfaces.IExpression;

public class Multiplication extends BinaryExpression implements IExpression {

    public Multiplication(IExpression leftValue, IExpression rightValue) {
        super(leftValue, rightValue);
    }

    @Override
    public double calculate() {
        return getLeftValue().calculate() * getRightValue().calculate();
    }
}
