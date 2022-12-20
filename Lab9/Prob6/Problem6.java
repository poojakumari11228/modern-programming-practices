package Lab9.Prob6;
/*
Implement a method public Set<String> union(List<Set<String>> sets) by creating a stream pipeline that transforms a list
of sets (of type String) into the union of those sets. Make use of the reduce method for streams.
Example: The union method should transform the list [{“A”, “B”}, {“D”}, {“1”, “3”, “5”}] to the
set {“A”, “B”, “D”, “1”, “3”, “5”}.
*/

import java.util.Set;
import java.util.List;
import java.util.Collections;
import java.util.Optional;
import java.util.HashSet;
import java.util.stream.Stream;

public class Problem6 {


    public static final Set<String> EMPTY_SET = new HashSet<String>();

    public Set<String> union(List<Set<String>> sets){

        Set<String> res = sets.stream().reduce((x, y) -> {x.addAll(y); return x;}).get();
        return res;
    }
    public static void main(String[] args) {

        List<Set<String>> listSet = new java.util.ArrayList<>();
        Set<String> h =  new java.util.HashSet<>();
        h.add("A"); h.add("B");
        Set<String> h2 =  new java.util.HashSet<>();
        h2.add("D");
        Set<String> h3 =  new java.util.HashSet<>();
        h3.add("1");h3.add("3");h3.add("5");

        listSet.add(h);
        listSet.add(h2);
        listSet.add(h3);

        System.out.println(new Problem6().union(listSet));;
    }
}
