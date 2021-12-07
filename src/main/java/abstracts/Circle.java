package abstracts;

public class Circle extends Figure implements IFigure, Printable {

    private double radius;

    public Circle() {}

    public Circle(double radius) {
        this.radius = radius;
        calcSquare();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getSquare() {
        return square;
    }

    @Override
    public void calcSquare() {
        square = Math.PI * Math.pow(radius, 2);
    }
    @Override
    public void display() {
        System.out.println("This is a circle with radius - " + radius + " and square - " + square);
    }

}
