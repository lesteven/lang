import java.util.*;

public class Hmap {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>(); 
        map.put("hello", 10);
        map.put("goodbye", 20);
        map.put("foo", 100);
        System.out.println(map);

        map.remove("foo");
        System.out.println(map);

        for (Map.Entry<String, Integer> each : map.entrySet()) {
            System.out.println(each.getKey() + " " + each.getValue());
        }
    }
}
