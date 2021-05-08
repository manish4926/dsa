//import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListIntro {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list);

        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        System.out.println(list);

        System.out.println("Value at 3 -> "+ list.get(3));

        list.remove(2);

        System.out.println(list);

        list.set(0,99);

        System.out.println(list);

        list.add(2,40);

        System.out.println(list);

        for (int val : list) {
            System.out.println(val);
        }

        System.out.println(list.size());
    }
}
