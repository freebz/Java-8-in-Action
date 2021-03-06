// 예제 11-11 CompletableFuture로 findPrices 구현하기

public List<String> findPrices(String product) {
    List<CompletableFuture<String>> priceFutures =
	shops.stream()
	.map(shop -> CompletableFuture.supplyAsync(
		 () -> shop.getName() + " price is " +
		 shop.getPrice(product)))
	.collect(Collectors.toList());

    return priceFutures.stream()
	.map(CompletableFuture::join)
	.collect(toList());
}
