package week5_hw_java;

import java.util.ArrayList;
import java.util.ListIterator;

public class Programme_5_ArrayListwithIterator {
    public static void main(String[] args) {
        ArrayList<String> fruitList = new ArrayList<>();
        fruitList.add("APPLE");
        fruitList.add("   BANANA   ");
        fruitList.add("GRAPE");
        fruitList.add("MANGO");
        fruitList.add("KIWI");
        fruitList.add("ORANGE");
        fruitList.add("BLACKBERRY");
        fruitList.add("STRAWBERRY");
        fruitList.add("  CHERRY  ");

        ListIterator<String> iterate = fruitList.listIterator();
        while (iterate.hasNext()) {
            System.out.print(iterate.next() + ", ");
        }
    }
}
