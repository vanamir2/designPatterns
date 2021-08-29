package cz.vanamir2.dp.solid.openclosed.specification;

import cz.vanamir2.dp.solid.openclosed.Color;
import cz.vanamir2.dp.solid.openclosed.Product;

public class ColorSpecification implements Specification<Product> {

    private final Color color;

    public ColorSpecification(Color color) {
        this.color = color;
    }

    @Override
    public boolean isSatisfied(Product item) {
        return item.color == color;
    }
}
