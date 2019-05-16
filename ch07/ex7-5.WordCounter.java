// 예제 7-5 문자열 스트림을 탐색하면서 단어 수를 세는 클래스

class WordCounter {
    private final int counter;
    private final boolean lastSpace;

    public WordCounter(int counter, boolean lastSpace) {
	this.counter = counter;
	this.lastSpace = lastSpace;
    }

    public WordCounter accumulate(Character c) {
	if (Character.isWhitespace(c)) {
	    return lastSpace ?
		this :
		new WordCounter(counter, true);
	} else {
	    return lastSpace ?
		new WordCounter(counter + 1, false);
	    this;
	}
    }

    public WordCounter combine(WordCounter wordCounter) {
	return new Wordcounter(counter = wordcounter.counter,
			       wordcounter.lastSpace);
    }

    public int getCounter() {
	return counter;
    }
}
