package tests;

import classes.Point;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class PointTest {

    @Test
    public void distanceToXY () {

        Point point1 = new Point(30, 40);
        Point point2 = new Point(0,0);
        Assertions.assertEquals(50.0, point2.distanceTo(point1), 0.01);
    }


    @Test
    public void distanceToXYZ () {

        Point point1 = new Point(40, 40, 20);
        Point point2 = new Point(0,0,0);
        Assertions.assertEquals(60.0, point2.distanceTo(point1),0.01);
    }

    @Test
    public void isOnOneStraightLine () {

        Point point1 = new Point(1, 8);
        Point point2 = new Point(-2, -7);
        Point point3 = new Point(-4, -17);
        Assertions.assertTrue(Point.isOneStraightLine(point1, point2, point3));
    }

    @Test
    public void isNotOnOneStraightLine () {

        Point point1 = new Point(1, 3, 4);
        Point point2 = new Point(2, -7, 7);
        Point point3 = new Point(-4, -14, 1);
        Assertions.assertFalse(Point.isOneStraightLine(point1, point2, point3));
    }

    @Test
    public void areInOnePlane () {

        Point point1 = new Point(1, -2, 2);
        Point point2 = new Point(1, 4, 0);
        Point point3 = new Point(-4, 1, 1);
        Point point4 = new Point(-5, -5, 3);
        Assertions.assertTrue(Point.isOnePlane(point1, point2, point3, point4));
    }

    @Test
    public void areNotInOnePlane () {

        Point point1 = new Point(5 , 3, 1);
        Point point2 = new Point(-3, 2, 3);
        Point point3 = new Point(3, 8, 6);
        Point point4 = new Point(-3, 1, 2);
        Assertions.assertFalse(Point.isOnePlane(point1, point2, point3, point4));
    }

}