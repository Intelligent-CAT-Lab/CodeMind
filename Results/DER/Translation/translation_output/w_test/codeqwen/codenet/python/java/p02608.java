Here is the Java version of the provided Python code:

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

This Java code does the same thing as the Python code. It reads an integer from the console, then it creates a HashMap to count the occurrences of each number from 1 to n. It then iterates over all possible combinations of x, y, and z, calculates the sum of their squares and the sum of their products, and if the sum is less than or equal to n, it increments the count of that sum in the HashMap. Finally, it prints out the count of each number from 1 to n.
