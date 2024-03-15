Here is the equivalent Java code for the provided Python script:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int ans = 0;
        int x = 1;
        while (2 * x - 1 <= N) {
            x = 2 * x;
            ans += 1;
        }
        System.out.println(ans);
        scanner.close();
    }
}
```

This Java code does the same thing as the Python code: It reads an integer from the standard input, doubles the value of `x` until `2 * x - 1` is greater than `N`, and counts how many doublings occur. Finally, it prints the count.
