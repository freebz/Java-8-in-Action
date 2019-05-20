// 예제 11-7 팩토리 메서드 supplyAsync로 CompletableFuture 만들기

public Future<Double> getPriceAsync(String product) {
    return CompletableFuture.supplyAsync(() -> calculatePrice(product));
}
