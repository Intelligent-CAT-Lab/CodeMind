Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int t = 0;
        int n = 1;
        int a = 1;
        while (true) {
            n = (K + a - 1) / K;
            a += n;
            if (N < a) {
                break;
            }
            t += 1;
        }
        System.out.println(t);
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, calculates the result and prints it. The `Scanner` class is used to read the input from the user.
