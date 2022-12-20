package Lab9.Prob8;


import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;
import java.util.Arrays;
import java.util.List;
import java.util.Comparator;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PuttingIntoPractice {
    public static void main(String... args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );


        // Query 1: Find all transactions from year 2011 and sort them by value (small to high).
        Function<Integer, List<Transaction>> findByYear = (x) -> {
            return transactions.stream()
                    .filter(y -> y.getYear() == x)
                    .sorted(Comparator.comparing(Transaction::getValue))
                    .collect(java.util.stream.Collectors.toList());
        };

        System.out.println(findByYear.apply(2011));

        // Query 2: What are all the unique cities where the traders work?
        Supplier<List<String>> uniqueCities = () -> {
            return transactions.stream()
                    .map(x -> x.getTrader().getCity())
                    .distinct()
                    .collect(java.util.stream.Collectors.toList());
        };

        System.out.println(uniqueCities.get());

        // Query 3: Find all traders from Cambridge and sort them by name.
        Function<String, List<Trader>> findCambTraders = x -> {
            return transactions.stream()
                    .map(y -> y.getTrader())
                    .filter(z -> z.getCity().equals(x))
                    .sorted(Comparator.comparing(Trader::getName))
                    .collect(Collectors.toList());
        };

        System.out.println(findCambTraders.apply("Cambridge"));


        // Query 4: Return a string of all traders names sorted alphabetically.
        Supplier<String> allTradersNames = () -> {
            return transactions.stream()
                    .map(x -> x.getTrader().getName())
                    .sorted()
                    .collect(Collectors.joining(", "));
        };

        System.out.println(allTradersNames.get());

        // Query 5: Are there any trader based in Milan?
        Predicate<String> isTraderAvailable = (x) -> {
            return transactions.stream()
                    .map(y -> y.getTrader().getCity())
                    .anyMatch(z -> z.equals(x));
        };
        System.out.println(isTraderAvailable.test("Milan"));

        // Query 6: Update all transactions so that the traders from Milan are set to Cambridge.

        BiConsumer<String,String> setMillanToCamb = (x,y) -> {
             transactions.stream()
                    .map(u -> u.getTrader())
                    .filter(v->v.getCity().equals(x))
                     .forEach(w->w.setCity(y));
        };
        setMillanToCamb.accept("Milan","Cambridge");
        transactions.stream().forEach(x->System.out.println(x));

        // Query 7: What's the highest value in all the transactions?
        Function<List<Transaction>, Integer> highestValue = (x)->{
            return x.stream()
                    .map(u-> u.getValue())
                    .reduce(0, Integer::max);
        };

        System.out.println(highestValue.apply(transactions));

    }
}

