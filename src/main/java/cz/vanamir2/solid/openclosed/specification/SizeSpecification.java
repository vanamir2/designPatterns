package cz.vanamir2.solid.openclosed.specification;

import cz.vanamir2.solid.openclosed.Product;
import cz.vanamir2.solid.openclosed.Size;

public class SizeSpecification implements Specification<Product> {

    private final Size size;

    public SizeSpecification(Size size) {
        this.size = size;
    }

    @Override
    public boolean isSatisfied(Product item) {
        return item.size == size;
    }
}
