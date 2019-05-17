// 예제 10-1 Person/Car/Insurance 데이터 모델

public class Person {
    private Car car;
    public Car getCar() { return car; }
}

pulibc class Car {
    private Insurance insurance;
    public Insurance getInsurance() { return insurance; }
}

public class Insurance {
    private String name;
    public String getName() { return name; }
}
