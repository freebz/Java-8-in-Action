// 예제 D-1 익명 내부 클래스로 구현한 Function

import java.util.function.Function;

public class InnerClass {
    Function<Object, String> f = new Function<Object, String>() {
	@Override
	public String apply(Object obj) {
	    return obj.toString();
	}
    };
}
