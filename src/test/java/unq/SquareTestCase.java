package unq;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Point;
import ar.edu.unq.po2.tp3.Square;

public class SquareTestCase {

    @Test
    public void testSquareCreationAndGetters() {
        Point origin = new Point(1.0, 2.0);
        Square square = new Square(origin, 4.0);

        assertEquals(origin, square.getOrigin());
        assertEquals(4.0, square.getSide());
        assertEquals(4.0, square.getWidth());
        assertEquals(4.0, square.getHeight());
    }

    @Test
    public void testSquareAreaAndPerimeter() {
        Square square = new Square(0.0, 0.0, 5.0);

        assertEquals(25.0, square.getArea());
        assertEquals(20.0, square.getPerimeter());
    }

    @Test
    public void testSquareIsNeitherHorizontalNorVertical() {
        Square square = new Square(0.0, 0.0, 3.0);

        assertFalse(square.isHorizontal());
        assertFalse(square.isVertical());
    }

    @Test
    public void testNegativeSideThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> new Square(0.0, 0.0, -3.0));
    }
}
