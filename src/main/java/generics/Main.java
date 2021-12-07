package generics;

public class Main {

    static <T> void print(T[] items) {
        for(T item: items) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        String[] str = new String[]{"asd", "a", "b"};
        Integer[] a = new Integer[]{1, 2, 3};

        print(str);
        print(a);

        Account<Float, Double> acc = new Account<>(1f, 2.0);
        System.out.println("Id class = " + acc.getId().getClass());
        System.out.println("Sum class = " + acc.getSum().getClass());
    }
}
