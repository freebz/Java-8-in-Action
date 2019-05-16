// 예제 7-1 n개의 숫자를 더하는 함수의 성능 측정

public long measureSumPerf(Function<Long, Long> adder, long n) {
    long fastest = Long.MAX_VALUE;
    for (int i = 0; i < 10; i++) {
	long start = System.nanoTime();
	long sum = adder.apply(n);
	long duration = (System.nanoTime() - start) / 1_000_000;
	System.out.println("Result: " + sum);
	if (duration < fastest) fastest = duration;
    }
    return fastest;
}
