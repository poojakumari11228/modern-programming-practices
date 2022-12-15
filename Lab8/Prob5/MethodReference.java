package Lab8.Prob5;

import java.util.function.Consumer;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

/*  METHOD REFERENCE

String[]names={"Alexis","Tim","Kyleen", “KRISTY”};
Use Arrays.sort()to sort the names by ignore case using Method reference.
*/

public class MethodReference {

    public static void main(String[] args) {

        String[] names={"Alexis","Tim","Kyleen", "KRISTY"};

        Arrays.sort(names, String:: compareToIgnoreCase);
        Arrays.stream(names).forEach(x->System.out.println(x));

    }
}
