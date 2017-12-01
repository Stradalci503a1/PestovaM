package classes;

import interfaces.IExpression;

public abstract class BinaryExpression implements IExpression {

    private IExpression leftValue;
    private IExpression rightValue;

    BinaryExpression(IExpression leftValue, IExpression rightValue) {

        this.leftValue = leftValue;
        this.rightValue = rightValue;
    }

    IExpression getLeftValue() {

        return leftValue;
    }

    IExpression getRightValue() {

        return rightValue;
    }

}
