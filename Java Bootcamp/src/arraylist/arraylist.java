package arraylist;

import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(10);
        list.add(3);
        list.add(39);
        list.add(19);
        System.out.println(list);
        System.out.println(list.get(1));
        list.set(1,29);
        System.out.println(list.get(1));
        System.out.println(list.contains(398));
        list.remove(3);
        System.out.println(list);
    }
}
