package fpbasicsjava;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Currying {

  private static <T> Function<T, Function<T, T>> curry(BiFunction<T, T, T> fn) {
    return x -> y -> fn.apply(x, y);
  }

  public static void main(String[] args) {
    BiFunction<Integer, Integer, Integer> add = (Integer x, Integer y) -> x + y;

    System.out.println(add.apply(1, 2));

    Function<Integer, Function<Integer, Integer>> curriedAdd = Currying.curry(add);

    Function<Integer, Integer> incrementBy1 = curriedAdd.apply(1);

    System.out.println(incrementBy1.apply(0));

    System.out.println(curriedAdd.apply(1).apply(2));
  }

}
