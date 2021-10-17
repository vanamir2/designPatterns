package cz.vanamir2.solid.openclosed;

import cz.vanamir2.solid.openclosed.specification.AndSpecification;
import cz.vanamir2.solid.openclosed.specification.ColorSpecification;
import cz.vanamir2.solid.openclosed.specification.SizeSpecification;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
        Product tree = new Product("Tree", Color.GREEN, Size.LARGE);
        Product house = new Product("House", Color.BLUE, Size.LARGE);
        List<Product> products = List.of(apple, tree, house);

        // WRONG WAY
        ProductFilter productFilter = new ProductFilter();
        System.out.println("Green products (old):");
        productFilter.filterByColor(products, Color.GREEN).forEach(p -> System.out.println(" - " + p.name + " is green"));

        // PROPER WAY - using Specification Design Pattern
        ColorSpecification greenSpec = new ColorSpecification(Color.GREEN);
        System.out.println("Green products (new):");
        BetterProductFilter betterProductFilter = new BetterProductFilter();
        betterProductFilter.filter(products, greenSpec).forEach(p -> System.out.println(" - " + p.name + " is green"));

        System.out.println("Large blue items (new):");
        betterProductFilter.filter(products, new AndSpecification<>(
                new ColorSpecification(Color.BLUE),
                new SizeSpecification(Size.LARGE)
        )).forEach(p -> System.out.println(" - " + p.name + " is large and blue"));
    }
}
