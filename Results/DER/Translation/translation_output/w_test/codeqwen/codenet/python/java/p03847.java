Here is the Java version of your Python code:

```java
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int N = Integer.parseInt(System.console().readLine());
        Map<Integer, Integer> memo = new HashMap<>();
        memo.put(0, 1);
        memo.put(1, 2);

        System.out.println(func(N, memo));
    }

    public static int func(int N, Map<Integer, Integer> memo) {
        if (memo.containsKey(N)) {
            return memo.get(N);
        }
        int result = (func(N / 2, memo) + func((N - 1) / 2, memo) + func(N / 2 - 1, memo)) % (1000000007);

        memo.put(N, result);
        return result;
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the console, stores it in the variable `N`, and then calls the `func` method with `N` and a `HashMap` as arguments. The `func` method checks if the result for `N` is already in the `HashMap`. If it is, it returns that result. If not, it calculates the result, stores it in the `HashMap`, and then returns the result. The `main` method prints the result of the `func` method.
