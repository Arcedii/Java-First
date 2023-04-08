package src;

import java.util.ArrayList;
import java.util.LinkedList;

public class Collection {
    public static void main(String[] args)
    {
        /*
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(0, 20);
        numbers.add(1, 100);
        numbers.add(2, 10);

        System.out.println(numbers.size());

        System.out.println(numbers.get(1));

       // numbers.clear(); (чистит весь список)

        for(Integer el: numbers) {
            System.out.println(el);
        } */



        LinkedList<Float> numbersFloat = new LinkedList<>();
        numbersFloat.add(0, 20.1f);
        numbersFloat.add(1, 22.3223f);
        numbersFloat.add(2, 2232.31313f);

        for (Float el: numbersFloat) {
            System.out.println(el);
        }
    }
}
