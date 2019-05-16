// 예제 6-1 통화별로 트랜젝션을 그룹화한 코드(명령형 버전)

Map<Currency, List<Transaction>> transactionsByCurrencies =
                                                  new HashMap<>();
for (Transaction transaction : transactions) {
    Currency currency = transaction.getCurrency();
    List<Transaction> transactionsForCurrency =
	                      transactionsByCurrencies.get(currency);
    if (transactionsForCurrency == null) {
	transactionsForCurrency = new ArrayList<>();
	transactionsByCurrencies
	                    .put(currency, transactionsForCurrency);
    }
    transactionsForCurrency.add(transaction);
}
