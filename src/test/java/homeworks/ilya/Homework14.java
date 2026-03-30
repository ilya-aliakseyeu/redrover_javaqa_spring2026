package homeworks.ilya;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Homework14 {


    public List<String> letterDelete(List<String> colors) {
        Iterator<String> it = colors.iterator();
        while (it.hasNext()) {
            if (it.next().contains("l")) {
                it.remove();
            }
        }
        return colors;
    }

    public List<Integer> list1000(Integer num) {
        List<Integer> to1000 = new ArrayList<>(List.of());
        for (int i = num; i <= 1000; i++) {
            to1000.add(i);
        }
        return to1000;

    }

    public void list1000Even(List<Integer> array) {
        Iterator<Integer> it = array.iterator();
        while (it.hasNext()) {
            if (it.next() % 2 == 0) {
                it.remove();
            }
        }
    }


    public static void main(String[] args) {
        Homework14 homework14 = new Homework14();


        System.out.println(homework14.letterDelete(new ArrayList<>(List.of(
                "White", "Tan", "Yellow", "Orange",
                "Red", "Pink", "Purple", "Blue")))); // Задача №1


        List<Integer> numbers = homework14.list1000(100);
        System.out.println(numbers); // Задача №2


        homework14.list1000Even(numbers);
        System.out.println(numbers); // Задача №3
    }
}