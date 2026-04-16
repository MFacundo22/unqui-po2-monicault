package ar.edu.unq.po2.tp3;

/**
 * Representa un rectángulo en un espacio bidimensional.
 * El rectángulo se define por su ubicación (origen) y sus dimensiones.
 */
public class Rectangle {

    private final Point origin;
    private final double width;
    private final double height;

    public Rectangle(Point origin, double width, double height) {
        if (origin == null) {
            throw new IllegalArgumentException("El punto de origen no puede ser null");
        }
        validateDimensions(width, height);
        this.origin = new Point(origin.getX(), origin.getY());
        this.width = width;
        this.height = height;
    }

    public Rectangle(double x, double y, double width, double height) {
        this(new Point(x, y), width, height);
    }

    private void validateDimensions(double width, double height) {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("El ancho y el alto deben ser mayores que cero");
        }
    }

    public Point getOrigin() {
        return new Point(origin.getX(), origin.getY());
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public boolean isHorizontal() {
        return width > height;
    }

    public boolean isVertical() {
        return height > width;
    }
}

    
  
