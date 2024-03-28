Below is the Java translation of the provided Python code. This program reads two integers `N` and `K` from the standard input, and prints "YES" if the criteria are met, otherwise it prints "NO".

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        
        if (N % 2 == 0) {
            if (N / 2 >= K) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            if (N / 2 + 1 >= K) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }
}
```

In a Java program, we don't use `input()` for taking inputs but instead create a `Scanner` object for this purpose. Also, Java is a statically-typed language unlike Python, so you have to declare the type of variables explicitly. Note that in Java, the "print" statement equivalent is `System.out.println()`.
