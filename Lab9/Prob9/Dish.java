package Lab9.Prob9;
import java.util.*;
/*
In this class implement some static methods to decide the following with help of Optional, anyMatch(), allMatch(),
 noneMatch(),findAny(), findFirst() operations from stream.
 a. Is there any Vegetarian meal available ( return type boolean)
 b. Is there any healthy menu have calories less than 1000 ( return type boolean)
 c.  Is there any unhealthy menu have  calories greater than 1000 ( return type boolean)
 d. find and return the first item for the type of MEAT( return type Optional<Dish>)
 e. calculateTotalCalories() in the menu using reduce. (return int)
 f. calculateTotalCaloriesMethodReference()in the menu using MethodReferences. (return int)
 g. Implement a main method to test.
*/

public class Dish {

    private final String name;
    private final boolean vegetarian;
    private final int calories;
    private final Dish.Type type;

    public Dish(String name, boolean vegetarian, int calories,Dish.Type type) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.calories = calories;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public int getCalories() {
        return calories;
    }

    public Lab9.Prob9.Dish.Type getType() {
        return type;
    }

    public enum Type { MEAT, FISH, OTHER }

    @Override
    public String toString() {
        return name;
    }

    public static final java.util.List<Dish> menu =
            java.util.Arrays.asList( new Lab9.Prob9.Dish("pork", false, 800, Dish.Type.MEAT),
                           new Lab9.Prob9.Dish("beef", false, 700, Dish.Type.MEAT),
                           new Lab9.Prob9.Dish("chicken", false, 400, Dish.Type.MEAT),
                           new Lab9.Prob9.Dish("french fries", true, 530, Dish.Type.OTHER),
                           new Lab9.Prob9.Dish("rice", true, 350, Dish.Type.OTHER),
                           new Lab9.Prob9.Dish("season fruit", true, 120, Dish.Type.OTHER),
                           new Lab9.Prob9.Dish("pizza", true, 550, Dish.Type.OTHER),
                           new Lab9.Prob9.Dish("prawns", false, 400, Dish.Type.FISH),
                           new Lab9.Prob9.Dish("salmon", false, 450, Dish.Type.FISH));

    public static boolean isVegMealAvailable(){
      return  menu.stream()
                .anyMatch(y->y.isVegetarian()==true);
    };

    public static boolean isAnyHealthyMeal(){
        return menu.stream()
                .anyMatch(y->y.getCalories()<1000);
    }
    public static boolean isAnyUnHealthyMeal(){
        return menu.stream()
                .anyMatch(y->y.getCalories()>1000);
    }

    public static Optional<Dish> firstMeatItem(){
        return menu.stream()
                .filter(x->x.getType()== Dish.Type.MEAT)
                .findFirst();
    }

    public static int calculateTotalCalories(){
        return menu.stream()
                .map(y->y.getCalories())
                .reduce(0,(x,y)->x+y);
    }
    public static int calculateTotalCaloriesMethodReference(){
        return menu.stream()
                .map(y->y.getCalories())
                .reduce(0,Integer::sum);
    }


    public static void main(String[] args) {

        System.out.println(isVegMealAvailable());
        System.out.println(isAnyHealthyMeal());
        System.out.println(isAnyUnHealthyMeal());
        System.out.println(firstMeatItem().get());
        System.out.println(calculateTotalCalories());
        System.out.println(calculateTotalCaloriesMethodReference());

    }

}