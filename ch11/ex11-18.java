// 예제 11-18 자바 7로 두 Future 합치기

ExecutorService executor = Executors.newCachedThreadPool();
final Future<Double> futureRate = executor.submit(new Callbable<Double>() {
    public Double call() {
	return exchangeService.getRate(Money.EUR, Money.USD);
    }
});
Future<Double> futurePriceInUSD = executor.submit(new Callbable<Double>() {
    public Double call() {
	double priceInEUR = shop.getPrice(product);
	return priceEUR * future.Rate.get();
    }
}):
