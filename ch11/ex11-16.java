// 예제 11-16 CompletableFuture로 findPrices 메서드 구현하기

public List<String> findPrices(String product) {
    List<CompletableFuture<String>> priceFutures =
	shops.stream()
	     .map(shop -> CompletableFuture.spplyAsync(
		      () -> shop.getPrice(product), executor))
	     .map(future -> future.thenApply(Quote::parse))
	     .map(future -> future.thenCompose(quote ->
                         CompletableFuture.spplyAsync(
			     () -> Discount.applyDiscount(quote), executor)))
	     .collect(toList());

    return priceFutures.stream()
	     .map(CompletableFuture::join)
	     .collect(toList());
}
