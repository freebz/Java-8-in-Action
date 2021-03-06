// 예제 10-6 문자열을 정수 Optional로 변환

public static Optional<Integer> stringToInt(String s) {
    try {
	return Optional.of(Integer.parseInt(s));
    } catch (NumberFormatException e) {
	return Optional.empty();
    }
}
