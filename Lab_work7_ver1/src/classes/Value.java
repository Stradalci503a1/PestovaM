package classes;

import interfaces.IExpression;

public class Value implements IExpression {

    private double value;

    public Value(byte value) { this.value = value; }

    public Value(short value) { this.value = value; }

    public Value(int value) { this.value = value; }

    public Value(long value) { this.value = value; }

    public Value(float value) {

        this.value = Math.round(value * 100000000) / 100000000.0;
    }

    public Value(double value) { this.value = value; }

    public Value(String value) {

        try {
            this.value = Double.valueOf(value);
        } catch (NumberFormatException exception) {
            this.value = Double.NaN;
        }
    }

    @Override
    public double calculate() {

        return value;
    }


}
