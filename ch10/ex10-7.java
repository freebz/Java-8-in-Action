// 예제 10-7 프로퍼티에서 지속시간을 읽는 명령형 코드

public int readDuration(Properties props, String name) {
    String value = props.getProperty(name);
    if (value != null) {
	try {
	    int i = Integer.parseInt(value);
	    if (i > 0) {
		return i;
	    }
	} catch (NumberFormatException nfe) { }
    }
    return 0;
}
