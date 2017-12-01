package classes;

import interfaces.IExpression;

public class Square extends UnaryExpression implements IExpression {

    public Square(IExpression value) {

        super(value);
    }

    @Override
    public double calculate() {

        return getValue().calculate() * getValue().calculate();
    }
}
