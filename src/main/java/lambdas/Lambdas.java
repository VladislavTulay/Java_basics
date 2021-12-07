package lambdas;

public class Lambdas {

    @FunctionalInterface
    interface MyInterface{

        String getStr();

    }

    @FunctionalInterface
    interface MyInterface2{

        String reverseStr(String str);

    }

    public static void main(String[] args) {
        MyInterface ref = () -> "Lambdas are great";
        System.out.println(ref.getStr());


        MyInterface2 ref2 = (str) -> {
            StringBuilder result = new StringBuilder();
            for (int i = str.length()-1; i >= 0 ; i--)
                result.append(str.charAt(i));
            return result.toString();
        };

        System.out.println(ref2.reverseStr("qwertyu"));
    }

}
