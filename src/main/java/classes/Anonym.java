package classes;

public class Anonym {

    public static void main(String[] args) {
        new Anonym() {
            {
                this.anyNewMethod();
            }

            void anyNewMethod() {
                System.out.println("Hello from anonimous");
            }
        };
    }

}
