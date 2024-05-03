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

This Java code does the same thing as your Python code. It reads an integer from the user, performs a binary search to find the largest integer less than or equal to the input that satisfies the condition `idxcnt < n`, and then prints the difference between the input and `idxcnt`.
