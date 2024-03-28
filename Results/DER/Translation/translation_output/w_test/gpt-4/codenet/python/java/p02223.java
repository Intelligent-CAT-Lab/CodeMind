Here's how you can translate the provided Python code to Java. Note that Java takes input differently compared to Python, and we need to include all code within a class and a `main` method. We'll also use a `Scanner` for input processing and `System.out.println` for output:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        if (n == 1) {
            System.out.println("1\n0");
        } else if (n == 2) {
            System.out.println("2\n0\n11");
        } else {
            System.out.println(n - 1);
            for (int i = 0; i < n - 1; i++) {
                System.out.println("1" + "0".repeat(i) + "1");
            }
        }
    }
}
```

Please note that `String.repeat(int)` is a method available since Java 11. If you're using an older version of Java, you'd have to replace that with a loop to append the zeroes. Also, don't forget to close the `Scanner` instance after it's no longer needed to prevent resource leaks.

Let's also address the test input you have provided:
```
Test input:
2
```

If you run the above Java program with the input `2`, the expected output will be:
```
2
0
11
```

This matches the expected output you provided.
