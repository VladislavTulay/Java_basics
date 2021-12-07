package abstracts;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(1);
        circle.display();
        circle.getStatus();

        Triangle triangle = new Triangle(3, 4, 5);
        triangle.display();
        triangle.getStatus();
    }

}
