package Lab9.Prob3;
/*
* Lamdas and Streams
*  Implement a given method requirement using Lambdas and streams in a Java 8 way.
*  public int countWords(List<String> words, char c, char d, int len)
* which counts the number of words in the input list words that have length equal to len,
*  that contain the character c, and that do not contain the character d.
 */

import java.util.List;
import java.util.ArrayList;

public class Problem3 {

    public int countWords(List<String> words, char c, char d, int len){

        int count = (int) words.stream()
                .filter(x->x.contains(c+""))
                .filter(x->!x.contains(d+""))
                .filter(x->x.length()==len)
                .count();

        return count;

    }

    public static void main(String[] args) {

        Problem3 p = new Problem3();
        List<String> strList = new ArrayList<>();
        strList.add("Counter");
        strList.add("Continue");
        strList.add("daylight");


        System.out.println( p.countWords(strList, 'e','a',8));

    }
}
