// 예제 12-9 TemporalAdjuster 인터페이스

@FunctionalInterface
public interface TemporalAdjuster {
    Temporal adjustIntro(Temporal temporal);
}
