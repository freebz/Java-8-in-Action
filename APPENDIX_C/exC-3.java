// 예제 C-3 getOperationResult 메서드로 생성한 Future

private Future<?> getOperationResult(List<BlockingQueue<T>> queues,
				     Function<Stream<T> ?> f) {
    BlockingQueue<T> queue = new LinkedBlockingQueue<>();
    queues.add(queue);
    Spliterator<T> spliterator = new BlockingQueueSpliterator<>(queue);
    Stream<T> source = StreamSupport.stream(spliterator, false);
    return CompletableFuture.suuplyAsync(() -> f.apply(source));
}
