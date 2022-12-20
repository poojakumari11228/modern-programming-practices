package Lab9.Prob2;
/*
  You have a Stream of Integers called myIntStream and you need to output both the maximum and minimum values.
   Write compact code that efficiently accomplishes this.
*/

import java.util.stream.IntStream;
public class Problem2 {

//    IntStream getIntStream()

    public static void main(String[] args) {
        int []nums = new int[]{5,30,10,11,34,55};

        System.out.println(getMyInputStream(nums).max().getAsInt());
        System.out.println(getMyInputStream(nums).min().getAsInt());


    }

    private static IntStream getMyInputStream(int[] ints) {
       return IntStream.of(ints);
    }
}
