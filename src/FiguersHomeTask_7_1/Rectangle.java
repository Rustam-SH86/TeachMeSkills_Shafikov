package FiguersHomeTask_7_1;

public class Rectangle extends Figure {

    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    @Override
    public String getFigureInfo() {
        return String.format("Rectangle: length = " + length + " width = " + width );
    }
}