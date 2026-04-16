package unq;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Point;
import ar.edu.unq.po2.tp3.Rectangle;

public class RectangleTestCase {

    @Test
    public void testRectangleCreationAndGetters() {
        Point origin = new Point(2.0, 3.0);
        Rectangle rectangle = new Rectangle(origin, 4.0, 5.0);

        assertEquals(origin, rectangle.getOrigin());
        assertEquals(4.0, rectangle.getWidth());
        assertEquals(5.0, rectangle.getHeight());
    }

    @Test
    public void testAreaAndPerimeter() {
        Rectangle rectangle = new Rectangle(0.0, 0.0, 3.0, 6.0);

        assertEquals(18.0, rectangle.getArea());
        assertEquals(18.0, rectangle.getPerimeter());
    }

    @Test
    public void testOrientationHorizontalAndVertical() {
        Rectangle horizontal = new Rectangle(0.0, 0.0, 6.0, 3.0);
        Rectangle vertical = new Rectangle(0.0, 0.0, 3.0, 6.0);

        assertTrue(horizontal.isHorizontal());
        assertFalse(horizontal.isVertical());

        assertTrue(vertical.isVertical());
        assertFalse(vertical.isHorizontal());
    }

    @Test
    public void testOriginImmutability() {
        Rectangle rectangle = new Rectangle(new Point(1.0, 1.0), 2.0, 2.0);
        Point origin = rectangle.getOrigin();
        origin.move(10.0, 10.0);

        assertEquals(new Point(1.0, 1.0), rectangle.getOrigin());
    }

    @Test
    public void testNegativeWidthThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(0.0, 0.0, -1.0, 2.0));
    }

    @Test
    public void testZeroHeightThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(0.0, 0.0, 2.0, 0.0));
    }
}
