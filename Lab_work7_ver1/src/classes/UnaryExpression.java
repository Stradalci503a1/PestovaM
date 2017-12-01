package classes;

import interfaces.IExpression;

public abstract class UnaryExpression implements IExpression {

    private IExpression value;

    UnaryExpression(IExpression value) { this.value = value; }

    IExpression getValue() { return value;}

}
