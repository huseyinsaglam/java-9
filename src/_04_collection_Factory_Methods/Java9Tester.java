package _04_collection_Factory_Methods;

import java.util.*;

public class Java9Tester {

    public static void main(String[] args) {

        System.out.println("*****************************************************");
        System.out.println("************************ Java 9 Old *****************************");

        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
       // set = Collections.unmodifiableSet(set);
        System.out.println(set);

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
       // list = Collections.unmodifiableList(list);
        System.out.println(list);


        Map<String, String> map = new HashMap<>();
        map.put("A","Apple");
        map.put("B","Boy");
        map.put("C","Cat");
       // map = Collections.unmodifiableMap(map);
        System.out.println(map);


        System.out.println("*****************************************************");
        System.out.println("************************ Java 9 New *****************************");

        Set<String> set1 = Set.of("A", "B", "C");
        System.out.println(set1);
        List<String> list1 = List.of("A", "B", "C");
        System.out.println(list1);
        Map<String, String> map1 = Map.of("A","Apple","B","Boy","C","Cat");
        System.out.println(map1);

        Map<String, String> map2 = Map.ofEntries (
                new AbstractMap.SimpleEntry<>("A","Apple"),
                new AbstractMap.SimpleEntry<>("B","Boy"),
                new AbstractMap.SimpleEntry<>("C","Cat"));
        System.out.println(map2);
    }

}
