package classes;

import interfaces.IExpression;

public class Absolute extends UnaryExpression {

    public Absolute (IExpression value) { super(value); }

    @Override
    public double calculate() {
        return Math.abs(getValue().calculate());
    }
}
