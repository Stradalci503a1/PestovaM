package classes;

import interfaces.IExpression;

public class Subtraction extends BinaryExpression implements IExpression {

    public Subtraction(IExpression leftValue, IExpression rightValue) {
        super(leftValue, rightValue);
    }

    @Override
    public double calculate() {
        return getLeftValue().calculate() - getRightValue().calculate();
    }
}
