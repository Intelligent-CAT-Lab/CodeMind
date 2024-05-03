Here is the Java version of the Python code:

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

This Java code does the same thing as the Python code. It reads an integer from the console, then it generates all possible combinations of three integers from 1 to 100, calculates the sum of squares and the sum of the three numbers for each combination, and if the sum is less than or equal to the input number, it adds the sum to a map. Finally, it prints the count of each sum from 1 to the input number.
