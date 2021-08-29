package cz.vanamir2.dp.solid.openclosed;

import java.util.List;
import java.util.stream.Stream;

//  WRONG WAY
// ------- Open-close principle
// opened for extension
// closed for modification ... we do not want to change already tested (and/or) delivered code
public class ProductFilter {

    public Stream<Product> filterByColor(List<Product> products, Color color) {
        return products.stream().filter(p -> p.color == color);
    }

    public Stream<Product> filterBySize(List<Product> products, Size size) {
        return products.stream().filter(p -> p.size == size);
    }

    public Stream<Product> filterBySizeAndColor(List<Product> products, Size size, Color color) {
        return products.stream().filter(p -> p.size == size && p.color == color);
    }
}
