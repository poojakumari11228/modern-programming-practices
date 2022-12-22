package Lab10.Prob2;

import java.util.*;
import java.time.LocalDate;
public class Problem2 {

    public static <T extends Comparable<? super T>> T secondSmallest(List<T> list) {

        for (int i = 0; i < list.size(); i++) {

            for (int j = i + 1; j < list.size(); j++) {

                if (list.get(i).compareTo(list.get(j)) > 0) {
                    Collections.swap(list, i, j);
                }
            }
        }

        return list.get(1);
    }

    public static void main(String[] args) {

//        integer

        List<Integer> list = new java.util.ArrayList<>();
        list.add(2);
        list.add(8);
        list.add(1);
        list.add(5);


        System.out.println(secondSmallest(list));

//        string
        List<String> strList = new java.util.ArrayList<>();
        strList.add("a");
        strList.add("abcd");
        strList.add("ab");
        strList.add("bdhj");



        System.out.println(secondSmallest(strList));

//      Local date

        List<LocalDate> dates = Arrays.asList(LocalDate.of(1900, 1, 1), LocalDate.of(1950,1,1),
                LocalDate.of(1975, 1, 1), LocalDate.of(2000, 1, 1));

        System.out.println(secondSmallest( dates));



    }

}
