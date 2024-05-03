Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Map<Integer, Integer> count = new HashMap<>();
        int ans = 1;
        List<Integer> num = new ArrayList<>();

        for (int i = 2; i <= N; i++) {
            for (int n : num) {
                while (i % n == 0) {
                    count.put(n, count.getOrDefault(n, 0) + 1);
                    i /= n;
                }
                if (i == 1) {
                    break;
                }
            } else {
                num.add(i);
                count.put(i, 1);
            }
        }

        for (int n : count.values()) {
            ans = (int) ((ans * (n + 1)) % 1000000007);
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as your Python code. It reads an integer N from the standard input, then it calculates the prime factorization of N and counts the number of times each prime factor appears. It then calculates the product of the counts plus one, modulo 10^9 + 7, and prints the result.
