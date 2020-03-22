package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

/**
 * TestPoint.
 *
 * @author Valera Goncharenko (goncharikvv@gmail.com)
 * @version $Id$
 * @since 22.03.2020.
 */
public class PointTest {

    /**
     * Test for 2D.
     */
    @Test
    public void distanceTest() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double expected = 2;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    /**
     * Test for 3D.
     */
    @Test
    public void distance3d() {
        Point first = new Point(20, 10, 10);
        Point second = new Point(40, 10,10);
        double expected = 20;
        double out = first.distance3d(second);
        Assert.assertEquals(expected, out, 0.01);
    }
}
