package classes;

import interfaces.IExpression;

public class Addition extends BinaryExpression {

    public Addition (IExpression leftValue, IExpression rightValue) {

        super(leftValue, rightValue);
    }

    @Override
    public double calculate() {

        return getLeftValue().calculate() + getRightValue().calculate();
    }
}
