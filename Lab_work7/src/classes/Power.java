package classes;

import interfaces.IExpression;

public class Power extends BinaryExpression implements IExpression {

    public Power(IExpression leftValue, IExpression rightValue) {
        super(leftValue, rightValue);
    }

    @Override
    public double calculate() {

        double value = getLeftValue().calculate();
        double power = getRightValue().calculate();

        if (value >= 0 || power < 0 || power > 1) {
            return Math.pow(value, power);
        }
        else if (Math.pow(power, -1.0) % 2 == 0) {
            return Double.NaN;
        }
        else {
            return -Math.pow(Math.abs(value), power);
        }

    }

}
