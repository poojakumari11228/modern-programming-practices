package Lab8.Prob4;

/*  LAMBDA EXPRESSION AND METHOD REFERENCES

List<String> fruits=Arrays.asList("Apple","Banana","Orange","Cherries","blums");
a.Print the given list using forEach with Lambdas
b.Print the given list using method reference:
*/

import java.util.List;
import java.util.Arrays;
import java.util.function.Consumer;


public class LambdaExpressionAndMethodReference {

    public static void main(String[] args) {

        List<String> fruits=Arrays.asList("Apple","Banana","Orange","Cherries","blums");

        System.out.println("Print fruits using forEach with Lambda");
        fruits.forEach(x-> System.out.println(x));

        System.out.println("\nPrint fruits using method reference");
        fruits.forEach(System.out::println);


    }
}
