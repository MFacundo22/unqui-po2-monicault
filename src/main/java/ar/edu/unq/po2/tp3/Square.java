package ar.edu.unq.po2.tp3;

/**
 * Representa un cuadrado en un espacio bidimensional.
 * Un cuadrado es un rectángulo con ancho y alto iguales.
 */
public class Square extends Rectangle {

    public Square(Point origin, double side) {
        super(origin, side, side);
    }

    public Square(double x, double y, double side) {
        super(x, y, side, side);
    }

    public double getSide() {
        return getWidth();
    }

    @Override
    public boolean isHorizontal() {
        return false;
    }

    @Override
    public boolean isVertical() {
        return false;
    }

    @Override
    public String toString() {
        return "Square(origin=" + getOrigin() + ", side=" + getSide() + ")";
    }
}
