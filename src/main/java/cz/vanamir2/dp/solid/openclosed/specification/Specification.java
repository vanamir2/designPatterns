package cz.vanamir2.dp.solid.openclosed.specification;

@FunctionalInterface
public interface Specification<T> {

    boolean isSatisfied(T item);
}
