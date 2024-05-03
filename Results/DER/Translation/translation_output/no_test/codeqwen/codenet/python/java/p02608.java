Here is the Java version of your Python code:

```java
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(System.console().readLine());
        Map<Integer, Integer> cnt = new HashMap<>();
        for (int x = 1; x <= 100; x++) {
            for (int y = 1; y <= 100; y++) {
                for (int z = 1; z <= 100; z++) {
                    int a = x * x + y * y + z * z + x * y + y * z + z * x;
                    if (a <= n) {
                        cnt.put(a, cnt.getOrDefault(a, 0) + 1);
                    }
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            System.out.println(cnt.getOrDefault(i, 0));
        }
    }
}
```

This Java code does the same thing as your Python code. It creates a HashMap to count the occurrences of each number up to `n`. It then prints out the count of each number up to `n`.
