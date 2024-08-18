package learning_java;

import java.util.HashSet;

public class hashing {
    public static void main(String[] args) {
        HashSet<Integer> myHashSet = new HashSet<>(6,0.5f);
        myHashSet.add(6);
        myHashSet.add(8);
        myHashSet.add(1);
        myHashSet.add(9);
        myHashSet.add(5);
        myHashSet.add(19);
        myHashSet.add(23);
        System.out.println(myHashSet);
    }
}
