package classes;

import java.io.IOException;

public class Outer {
    private static int a = 1;
    private int b = 1;


    void setA(int var) throws IOException {
        Nested2.setA(var);
    }

    void setB(int var) {
        b = var;
    }

    class Nested1 {

        void a() {
            a = 2;
            b = 0;
        }
    }

    public static class Nested2 {
        static void setA(int var) throws IOException {
            a = var;
        }
    }

}
