package classes;

import interfaces.IExpression;

public class Division extends BinaryExpression implements IExpression {

    public Division(IExpression leftValue, IExpression rightValue) {

        super(leftValue, rightValue);
    }

    @Override
    public double calculate() {

        if (getRightValue().calculate() == 0) {
            return Double.NaN;
        }
        else {
            return getLeftValue().calculate() / getRightValue().calculate();
        }

    }

}
