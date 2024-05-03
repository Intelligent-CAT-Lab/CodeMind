Here is the Java equivalent of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        if (K == 1) {
            System.out.println(0);
        } else {
            System.out.println(N - K);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the user, N and K, and then prints the result of N - K if K is not equal to 1. If K is equal to 1, it prints 0.
