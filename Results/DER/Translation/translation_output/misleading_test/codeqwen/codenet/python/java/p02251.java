Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ans = 0;
        int[] x = {25, 10, 5, 1};
        for (int i = 0; i < x.length; i++) {
            ans += n / x[i];
            n %= x[i];
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the user, divides it by each of the numbers in the array `x`, and adds the result to `ans`. After each division, it also calculates the remainder of the division and assigns it back to `n`. Finally, it prints the value of `ans`.
