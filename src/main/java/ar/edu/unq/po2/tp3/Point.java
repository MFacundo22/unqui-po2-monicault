package ar.edu.unq.po2.tp3;

/**
 * Clase que representa un punto en el plano bidimensional.
 */
public class Point {
    private double x;
    private double y;

    /**
     * Constructor que crea un punto en las coordenadas especificadas.
     * 
     * @param x la coordenada x del punto
     * @param y la coordenada y del punto
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Constructor que crea un punto en las coordenadas (0, 0).
     */
    public Point() {
        this(0, 0);
    }

    /**
     * Obtiene la coordenada x del punto.
     * 
     * @return la coordenada x
     */
    public double getX() {
        return x;
    }

    /**
     * Obtiene la coordenada y del punto.
     * 
     * @return la coordenada y
     */
    public double getY() {
        return y;
    }

    /**
     * Mueve el punto a una nueva posición.
     * 
     * @param newX la nueva coordenada x
     * @param newY la nueva coordenada y
     */
    public void move(double newX, double newY) {
        this.x = newX;
        this.y = newY;
    }

    /**
     * Suma este punto con otro punto y retorna un nuevo punto con los valores
     * de x e y sumados.
     * 
     * @param other el otro punto a sumar
     * @return un nuevo punto con las coordenadas sumadas
     */
    public Point add(Point other) {
        return new Point(this.x + other.x, this.y + other.y);
    }

    /**
     * Retorna una representación en texto del punto.
     * 
     * @return una cadena con el formato "Point(x, y)"
     */
    @Override
    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }

    /**
     * Compara si dos puntos son iguales.
     * 
     * @param obj el objeto a comparar
     * @return true si ambos puntos tienen las mismas coordenadas
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Point point = (Point) obj;
        return Double.compare(point.x, x) == 0 && Double.compare(point.y, y) == 0;
    }

    /**
     * Calcula el hashCode del punto.
     * 
     * @return el hashCode
     */
    @Override
    public int hashCode() {
        return Double.hashCode(x) + Double.hashCode(y);
    }
}
