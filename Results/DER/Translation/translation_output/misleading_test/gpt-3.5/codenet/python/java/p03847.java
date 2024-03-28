```java
import java.util.HashMap;

public class Main {
    static HashMap<Integer, Integer> memo = new HashMap<>();

    public static void main(String[] args) {
        int N = 3;
        memo.put(0, 1);
        memo.put(1, 2);

        System.out.println(func(N));
    }

    public static int func(int N) {
        if (memo.containsKey(N)) {
            return memo.get(N);
        }

        int result = (func(N / 2) + func((N - 1) / 2) + func(N / 2 - 1)) % (int)Math.pow(10, 9) + 7;

        memo.put(N, result);
        return result;
    }
}
```
