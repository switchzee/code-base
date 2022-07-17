package jlearning.lambdal.pkg;

@FunctionalInterface
public interface Factory<T> {
    T getItem();
}
