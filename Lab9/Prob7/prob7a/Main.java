package Lab9.Prob7.prob7a;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee("Joe", "Davis", 120000),
				          new Employee("John", "Sims", 110000),
				          new Employee("Joe", "Stevens", 200000),
		                  new Employee("Andrew", "Reardon", 80000),
		                  new Employee("Joe", "Cummings", 760000),
		                  new Employee("Steven", "Walters", 135000),
		                  new Employee("Thomas", "Blake", 111000),
		                  new Employee("Alice", "Richards", 101000),
		                  new Employee("Donald", "Trump", 100000));
		
		//your stream pipeline here

		String stream = list.stream()
				.filter(x -> x.salary > 100000)
				.filter(y -> y.lastName.charAt(0)> 'M')
				.map(z -> z.getFirstName() + " " + z.getLastName())
				.sorted()
				.collect(java.util.stream.Collectors.joining(", "));

		System.out.println(stream);




	}

}
