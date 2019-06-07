import java.util.*;


public class ArrList {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);

        List<Integer> list2 = Arrays.asList(1,5,2,4,10);

        List<Integer> list3 = new ArrayList<>();
        list3.add(77);
        list3.addAll(Arrays.asList(5,1,3,4));

        System.out.println("list1: " + list);
        System.out.println("list2: " + list2);
        System.out.println("list3: " + list3);
    }
}
