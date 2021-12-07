package classes;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        Outer.Nested1 a = new Outer().new Nested1();
        try {
            Outer.Nested2.setA(1);
        } catch (IOException e) {
            System.out.println("Вы словили исклбчение");
        }

        a.a();

    }

}