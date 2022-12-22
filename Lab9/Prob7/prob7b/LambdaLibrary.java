package Lab9.Prob7.prob7b;

public class LambdaLibrary {
    public static final TriFunction<java.util.List<Employee>, Character, Integer, String> fun = (w, x, y)->{
        return w.stream()
                .filter(t -> t.salary>y)
                .filter(u -> u.lastName.charAt(0) > x)
                .map(v -> v.getFirstName() + " " + v.getLastName())
                .sorted()
                .collect(java.util.stream.Collectors.joining(", "));

    };
}
