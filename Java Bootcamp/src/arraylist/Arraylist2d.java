package arraylist;
import java.util.*;
public class Arraylist2d {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        list.get(0).add(1);
        list.get(0).add(2);
        list.get(0).add(3);
        list.add(new ArrayList<>());
        list.get(1).add(4);
        list.get(1).add(5);
        list.get(1).add(6);
        list.add(new ArrayList<>());
        list.get(2).add(7);
        list.get(2).add(8);
        list.get(2).add(9);
        System.out.println(list);

    }
}
