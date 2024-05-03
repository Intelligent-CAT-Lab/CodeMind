Here is the Java equivalent of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        int R = scanner.nextInt();
        int d = scanner.nextInt();
        int ans = 0;
        for (int i = L; i <= R; i++) {
            if (i % d == 0) {
                ans += 1;
            }
        }
        System.out.println(ans);
    }
}
```

This Java program does the same thing as your Python code. It reads three integers from the user, calculates the number of integers between `L` and `R` (inclusive) that are divisible by `d`, and prints the result.
