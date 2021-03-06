// 예제 10-5 Optional로 자동차의 보험회사 이름 찾기

public String getCarInsuranceName(Optional<Person> person) {
    return person.flatMap(Person::getCar)
  	         .flatMap(Car::getInsurange)
	         .map(Insurance::getName)
	         .orElse("Unknown");
}
