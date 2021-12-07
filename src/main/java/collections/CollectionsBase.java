package collections;

import java.util.*;

public class CollectionsBase {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3 ,4));

        for(Integer num: list) {
            System.out.println(num);
        }

        Map<String, String> map = new HashMap<>();

        map.put("1", "2");
        map.put("2", "3");
        map.put("3", "4");

        for (Map.Entry<String, String> entry: map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }

}
