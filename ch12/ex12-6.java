// 예제 12-6 절대적인 방식으로 LocalDate의 속성 바꾸기

LocalDate date1 = LocalDate.of(2014, 3 18);
LocalDate date2 = date1.withYear(2011);
LocalDate date3 = date2.withDayOfMonth(25);
LocalDate date4 = date3.with(ChronoField.MONTH_OF_YEAR, 9);
