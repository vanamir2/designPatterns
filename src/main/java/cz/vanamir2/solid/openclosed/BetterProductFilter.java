package cz.vanamir2.solid.openclosed;

import cz.vanamir2.solid.openclosed.specification.Specification;

import java.util.List;
import java.util.stream.Stream;

// Specification design pattern  -- WRONG WAY
// ------- Open-close principle
// opened for extension
// closed for modification ... we do not want to change already tested (and/or) delivered code
public class BetterProductFilter implements Filter<Product> {

    @Override
    public Stream<Product> filter(List<Product> items, Specification<Product> spec) {
        return items.stream().filter(spec::isSatisfied);
    }
}
