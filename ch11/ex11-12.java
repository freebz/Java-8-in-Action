// 예제 11-12 우리의 최저가격 검색 애플리케이션에 맞는 커스텀 Executor

private final Executor executor =
    Executors.newFixedThreadPool(Math.min(shops.size(), 100),
				 new ThreadFactory() {
        public Thread newThread(Runable r) {
	    Thread t = new Thread(r);
	    t.setDaemon(true);
	    return t;
	}
});
