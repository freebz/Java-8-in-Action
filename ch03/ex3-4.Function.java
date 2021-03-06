// 예제 3-4 Function 예제

@FunctionalInterface
public interface Function<T, R> {
    R apply(T t);
}

public static <T, R> List<R> map(List<T> list,
				 Function<T, R> f) {
    List<R> result = new ArrayList<>();
    for (T s : list) {
	result.add(f.apply(s));
    }
    return result;
}

// [7, 2, 6]
List<Integer> l = map(
    Arrays.asList("lambdas", "in", "action"),
    (String s) -> s.length()
);
