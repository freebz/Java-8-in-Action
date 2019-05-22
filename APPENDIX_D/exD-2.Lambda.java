// 예제 D-2 람다 표현식으로 구현한 Function

import java.util.function.Function;

public class Lambda {
    Function<Object, String> f = obj -> obj.toString();
}
