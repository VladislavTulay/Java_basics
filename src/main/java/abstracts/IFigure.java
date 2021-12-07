package abstracts;

public interface IFigure {

    void calcSquare();

    default void getStatus() {
        System.out.println("This is a geometric figure");
    }

}
