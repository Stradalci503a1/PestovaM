package tests;

import classes.*;
import interfaces.IExpression;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TaskTests {

    @Test
    public void value() {

        //Byte
        IExpression value = new Value((byte)13);
        Assertions.assertEquals(13.0, value.calculate());

        //Short
        value = new Value((short)558);
        Assertions.assertEquals(558, value.calculate());

        //Int
        value = new Value(3);
        Assertions.assertEquals(3, value.calculate());

        //Long
        value = new Value(1488L);
        Assertions.assertEquals(1488, value.calculate());

        //Float
        value = new Value(12.5F);
        Assertions.assertEquals(12.5, value.calculate());

        //Double
        value = new Value(28.9);
        Assertions.assertEquals(28.9, value.calculate());

        //String
        value = new Value("228");
        Assertions.assertEquals(228, value.calculate());

        //Invalid String
        value = new Value("1234asda1233");
        Assertions.assertEquals(Double.NaN, value.calculate());
    }

    @Test
    public void absolute() {

        IExpression value = new Absolute(new Value(-9));
        Assertions.assertEquals(9, value.calculate());
    }

    @Test
    public void addition() {

        IExpression value = new Addition(new Value(7), new Value(3));
        Assertions.assertEquals(10, value.calculate());
    }

    @Test
    public void division() {

        IExpression value = new Division(new Value(8), new Value(2));
        Assertions.assertEquals(4, value.calculate());

        value = new Division(new Value(5), new Value(0));
        Assertions.assertEquals(Double.NaN, value.calculate());
    }

    @Test
    public void multiplication() {

        IExpression value = new Multiplication(new Value(13), new Value(-2));
        Assertions.assertEquals(-26, value.calculate());
    }

    @Test
    public void negative() {

        IExpression value = new Negative(new Value(8));
        Assertions.assertEquals(-8, value.calculate());
    }

    @Test
    public void power() {

        IExpression value = new Power(new Value(2), new Value(4));
        Assertions.assertEquals(16, value.calculate());

        value = new Power(new Value(-6), new Value(1.0/2.0));
        Assertions.assertEquals(Double.NaN, value.calculate());

        value = new Power(new Value(81), new Value(1.0/4.0));
        Assertions.assertEquals(3, value.calculate());

        value = new Power(new Value(-8), new Value(1.0/3.0));
        Assertions.assertEquals(-2, value.calculate());
    }

    @Test
    public void rest() {

        IExpression value = new Rest(new Value(7), new Value(3));
        Assertions.assertEquals(1, value.calculate());

        value = new Rest(new Value(2), new Value(0));
        Assertions.assertEquals(Double.NaN, value.calculate());
    }

    @Test
    public void square() {

        IExpression value = new Square(new Value(4));
        Assertions.assertEquals(16, value.calculate());
    }

    @Test
    public void subtraction() {

        IExpression value = new Subtraction(new Value(-12), new Value(3));
        Assertions.assertEquals(-15, value.calculate());
    }

    @Test
    public void mathematicalExpression() {
        //   (|-15 * (5+3)^2 - 1| + 14) / 15
        IExpression value =
                new Division(
                        new Value(new Addition
                                (new Value(new Absolute(
                                        new Value(new Subtraction
                                                (new Value(new Multiplication
                                                        (new Value(-15), new Square(
                                                                new Value(new Addition
                                                                        (new Value(5), new Value(3))
                                                                )
                                                        )
                                                        )
                                                ), new Value(1)
                                                )
                                        )
                                )), new Value(14)
                                )), new Value(15)
                );

        Assertions.assertEquals(65, value.calculate());

    }


}
