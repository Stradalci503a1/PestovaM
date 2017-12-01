package classes;

import interfaces.IExpression;

public class Negative extends UnaryExpression implements IExpression {

    public Negative(IExpression value) {
        super(value);
    }

    @Override
    public double calculate() {
        return -getValue().calculate();
    }
}
