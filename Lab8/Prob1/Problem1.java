package Lab8.Prob1;

import java.util.List;;
import java.util.ArrayList;
import java.util.function.BiFunction;

public class Problem1 {


    public static void main(String[] args) {

        /*
            (x, y) -> {
            List<Double> list = new ArrayList<>();
            list.add(Math.pow(x, y));
            list.add(x * y);
            return list;

        };*/

        BiFunction<Double, Double, List<Double>> biFun = (x, y) -> {
            List<Double> list = new ArrayList<>();
            list.add(Math.pow(x, y));
            list.add(x * y);
            return list;
        };

        List<Double> result = biFun.apply(2.0, 3.0);
        System.out.println(result);

    }

}