// 예제 11-20 Future 스트림을 반환하도록 findPrices 메서드 리팩토링하기

public Stream<CompletableFuture<String>> findPricesStream(String product) {
    return shops.stream()
	.map(shop -> CompletableFuture.supplyAsync(
		 () -> shop.getPrice(product), executor))
	.map(future -> future.thenApply(Quote::parse))
	.map(future -> future.thenCompose(quote ->
                CompletableFuture.supplyAsync(
		    () -> shop.getPrice(product), executor)));
}
