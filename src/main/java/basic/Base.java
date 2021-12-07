package basic;

import classes.Outer;

public class Base {

    public static void main(String[] args) {
        //standard_def();
        //var_def();
        //format_string();
        //arithmetic_and_bit_operations();
        //tern_op(1, 2, 3);
        //arrays();
        //cycles();
        string_equalizer();
        //string_buffer_and_builder();
    }

    public static void standard_def() {
        int a = 1;
        long b = 2;
        char c = 'c';
        boolean d = true;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }

//    public static void var_def() {
//        var integer_var = 1;
//        var long_var = 2L;
//        var char_var = 'c';
//        var boolean_var = true;
//
//        System.out.println(integer_var);
//        System.out.println(long_var);
//        System.out.println(char_var);
//        System.out.println(boolean_var);
//    }

    public static void format_string() {
        String name = "Uladzislau";
        int count = 2;

        System.out.printf("Hello, %s! Free space is %d", name, count);

        System.out.println();

        System.out.format("Hello, %s! Free space is %d", name, count);

        System.out.println();

        String x = String.format("Hello, %s! Free space is %d", name, count);
        System.out.println(x);

    }

    public static void arithmetic_and_bit_operations() {
        System.out.println(1 + 2 - 3 * 4 / 5 % 6);
        System.out.println((1 + 2 - 3) * 4 / 5 % 6);
        int x = 1;
        System.out.println(++x);
        System.out.println(x--);
        System.out.println(x);

        int v = -100;
        int c = 110;
        String v_bin = Integer.toBinaryString(v);
        String c_bin = Integer.toBinaryString(c);
        System.out.println("v в двоичном формате: " + v_bin);
        System.out.println("c в двоичном формате: " + c_bin);
        System.out.println("Операция логическое И (AND): " + Integer.toBinaryString(v&c));
        System.out.println("Операция логическое ИЛИ (OR): " + Integer.toBinaryString(v|c));
        System.out.println("Операция логическое исключающее ИЛИ (XOR): " + Integer.toBinaryString(v^c));
        System.out.println("Операция отрицания (NOT) ~: " + Integer.toBinaryString(~v));

        System.out.println("Значение v после побитового сдвига вправо на 2 разряда: " + (v >> 2));//1010 >> 2 -> 10 (10 >> 2 = 2)
        System.out.println("Значение v после побитового сдвига влево на 2 разряда: " + (v << 2));//1010 << 2 -> 101000 (10 << 2 = 40)
        System.out.println("Значение v после побитового сдвига вправо на 2 разряда: " + (v >>> 2));//unsigned(без учета знака)

        x = v;
        System.out.println("Значение х после присвоения ему значения v: " + x);

        x += 100;
        System.out.println("Значение х после применения оператора +=: " + x);

        x -= 200;
        System.out.println("Значение х после применения оператора -=: " + x);
    }

    public static void tern_op(int a, int b, int c) {
        System.out.println(a > b ? a-c : b-c);
    }

    public static void arrays() {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        System.out.println(arr[2]);
        System.out.println(3* arr[4]);
        for(int a: arr) {
            System.out.println(a);
        }

        int[][] matrix = new int[2][2];
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                matrix[i][j] = i + j;
            }
        }
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void cycles() {
        int count = 0;
        for(int i = 0; i < 10; i++) {
            System.out.print(count);
            count++;
        }
        System.out.println();
        System.out.println("For count = " + count);

        count = 0;
        while(count < 10) {
            System.out.print(count);
            count++;
        }
        System.out.println();
        System.out.println("While count = " + count);

        count = 0;
        do {
            System.out.print(count);
            count++;
        } while(count < 10);
        System.out.println();
        System.out.println("Do while count = " + count);
    }

    public static void string_equalizer() {
        String s1 = "Tom";
        String s2 = new String("Tom");
        String s3 = "Tom";

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s2));
        System.out.println(s3.equals(s2));
    }

    public static void string_buffer_and_builder() {
        StringBuffer s = new StringBuffer();
        s.append(1).append('c').insert(0, 12).insert(4, 'a');
        System.out.println(s);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(1).append('c').insert(0, 12).insert(4, 'a');
        System.out.println(stringBuilder);
    }

}
