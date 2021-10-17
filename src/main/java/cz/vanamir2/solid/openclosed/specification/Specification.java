package cz.vanamir2.solid.openclosed.specification;

@FunctionalInterface
public interface Specification<T> {

    boolean isSatisfied(T item);
}
