package Lab8.Prob2;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ProductInfo {

    SortMethod sortMethod;

    ProductInfo(SortMethod sortMethod) {
        this.sortMethod = sortMethod;
    }

    public SortMethod getSortMethod() {
        return sortMethod;
    }

    public void sort(List<Product> products) {

        if (sortMethod == SortMethod.BY_TITLE)
            Collections.sort(products, new TitleComparator());
        else if (sortMethod == SortMethod.BY_PRICE)
            Collections.sort(products, new PriceComparator());

    }

    public static void main(String[] args) {


        List<Product> products = new ArrayList<Product>();
        products.add(new Product("Product1", 231.1, 12));
        products.add(new Product("Product2", 120.1, 10));
        products.add(new Product("Product3", 49.2, 9));
        products.add(new Product("Product4", 44.1, 7));

        System.out.println("a. Sort by implementing a comparator for price attribute and print product list. ");
        Collections.sort(products, new PriceComparator());
        System.out.println(products);

        System.out.println("b. Sort by implementing a comparator for title attribute and print product list. ");
        Collections.sort(products, new TitleComparator());
        System.out.println(products);

        System.out.println("c. Implement the sort method so that only one type of Comparator is used for the task ");
        ProductInfo pInfo = new ProductInfo(SortMethod.BY_PRICE);

        pInfo.sort(products);
        System.out.println("Sort by price\n" + products);

        System.out.println("d. If the title is same use model as another attribute to sort. Do this by using lambda.");

        products.add(new Product("Product4", 44.4, 5));

        products.sort((p1, p2) -> {
            if (p1.getTitle().equals(p2.getTitle())) {
                return p1.getModel() - (p2.getModel());
            } else {
                return p1.getTitle().compareTo(p2.getTitle());
            }
        });


        System.out.println(products);


    }


}


