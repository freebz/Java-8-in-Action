// 예제 3-3 Consumer 예제

@FunctionalInterface
public interface Consumer<T> {
    void accept(T t);
}

public static <T> void forEach(List<T> list, Consumer<T> c) {
    for(T i: list) {
	c.accept(i);
    }
}

forEach(
    Arrays.asList(1, 2, 3, 4, 5),
    (Integer i) -> System.out.println(i)
);
