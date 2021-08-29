package cz.vanamir2.dp.solid.openclosed;

import cz.vanamir2.dp.solid.openclosed.specification.Specification;

import java.util.List;
import java.util.stream.Stream;

public interface Filter<T> {

    Stream<T> filter(List<T> items, Specification<T> spec);
}
