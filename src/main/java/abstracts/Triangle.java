package abstracts;

public class Triangle extends FigureWithAngles implements IFigure, Printable {

    private double a;
    private double b;
    private double c;

    public Triangle(){}

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        calcPerimeter();
        calcSquare();
    }

    @Override
    public void calcPerimeter() {
        perimeter = a + b + c;
    }

    @Override
    public void calcSquare() {
        double halfPerimeter = perimeter / 2;
        square = Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));
    }

    @Override
    public void display() {
        System.out.println("This is a triangle with square - " + square + " and perimeter - " + perimeter);
    }

}
