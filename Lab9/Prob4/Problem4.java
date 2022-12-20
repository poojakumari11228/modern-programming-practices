package Lab9.Prob4;

import java.util.stream.Stream;
/*
 * Create  public static void printSquares(int num)
 *  which creates an IntStream using the iterate method. The method prints to the console the first num squares.
 * For instance, if num = 4, then your method would output  1, 4, 9, 16. Note: You will need to come up with a
 * function to be used in the second argument of iterate.
 *
 * */

import java.util.stream.IntStream;
public class Problem4 {

    public static void printSquares(int num) {

        IntStream stream= IntStream.iterate(1, f->f+1)
          .map(f->f*f)
          .limit(num);
        stream.forEach( n->System.out.print(n+" "));

    }

    public static void main(String[] args) {

        printSquares(4);
    }
}
