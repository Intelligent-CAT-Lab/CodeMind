Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        String ans = "No";
        for (int i = 0; i <= n / 2; i++) {
            for (int j = 0; j < m; j++) {
                int o = i * j + (m - j) * (n - i);
                int x = n * m - o;
                if (o == k || x == k) {
                    ans = "Yes";
                }
            }
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the user, then it iterates over all possible pairs of integers (i, j) such that 0 <= i <= n/2 and 0 <= j < m. For each pair, it calculates the number of elements in the first and second halves of the array, and checks if either of these numbers is equal to k. If it is, it sets the answer to "Yes" and breaks out of the loop. After the loop, it prints the answer.
