package learning_java;
import java.util.*;

public class linked_list {
    public static void main(String[] args) {
        LinkedList<Integer> L1 = new LinkedList<>();
        LinkedList<Integer> L2 = new LinkedList<>();
        L2.add(16);
        L2.add(17);
        L2.add(18);

        L1.add(6);
        L1.add(7);
        L1.add(4);
        L1.add(6);
        L1.add(5);
        L1.add(9);
        L1.add(2,6);
        L1.addAll(0,L2);
        L1.addLast(6);

        L1.remove(1);
        L1.remove((Integer) 6);
        System.out.println(L1.contains(27));
        System.out.println(L1.indexOf(6));
        System.out.println(L1.lastIndexOf(6));
        for (int i = 0; i < L1.size(); i++) {
            System.out.print(i + ": ");
            System.out.println(L1.get(i));
        }
    }
}
