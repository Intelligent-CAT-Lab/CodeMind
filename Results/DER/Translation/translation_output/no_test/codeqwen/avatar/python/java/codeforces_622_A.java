Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int l = 1;
        int r = n;
        while (l < r) {
            int mid = l + (r - l) / 2;
            int idxcnt = mid * (mid + 1) / 2;
            if (idxcnt < n) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        l -= 1;
        int idxcnt = l * (l + 1) / 2;
        System.out.println(n - idxcnt);
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the user, then uses a binary search algorithm to find the largest integer less than or equal to `n` that satisfies the condition `mid * (mid + 1) / 2 < n`. Finally, it prints the difference between `n` and the calculated value.
