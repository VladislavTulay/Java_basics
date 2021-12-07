package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Streams {

    static class Product {
        int id;
        String name;
        float price;

        public Product(int id, String name, float price) {
            this.id = id;
            this.name = name;
            this.price = price;
        }
    }


    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        numbers.stream()
                .filter(i -> i % 2 == 0)
                .forEach(System.out::println);


        List<String> names = Arrays.asList("John", "Daenerys", "Tyrion", "", null, "Arya");

        names.stream()
                .filter(Objects::nonNull)
                .filter(name -> !name.isEmpty() && name.contains("a"))
                .forEach(System.out::println);

        List<Product> productsList = new ArrayList<>();

        productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(2, "Dell Laptop", 30000f));
        productsList.add(new Product(3, "Lenevo Laptop", 28000f));
        productsList.add(new Product(4, "Sony Laptop", 40000f));
        productsList.add(new Product(5, "Apple Laptop", 90000f));

        List<Float> productPriceList =productsList.stream()
                .filter(p -> p.price >= 30000)
                .map(p->p.price)
                .collect(Collectors.toList());

        System.out.println(productPriceList);

        List<String> productNameList =productsList.stream()
                .filter(p -> p.price >= 30000)
                .map(p->p.name)
                .collect(Collectors.toList());
        System.out.println(productNameList);
    }

}
