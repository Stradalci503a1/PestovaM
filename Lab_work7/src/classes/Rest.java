package classes;

import interfaces.IExpression;

public class Rest extends BinaryExpression implements IExpression {


    public Rest(IExpression leftValue, IExpression rightValue) {
        super(leftValue, rightValue);
    }

    @Override
    public double calculate() {

        if (getRightValue().calculate() == 0) {
            return Double.NaN;
        }
        else {
            return getLeftValue().calculate() % getRightValue().calculate();
        }

    }

}
