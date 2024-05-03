Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        for (int i = -1000; i <= 1000; i++) {
            for (int j = -1000; j <= 1000; j++) {
                if (i * i * i * i * i - j * j * j * j * j == x) {
                    System.out.println(i + " " + j);
                    return;
                }
            }
        }
    }
}
```

This Java code does the same thing as the Python code: it iterates over all possible values of `i` and `j` between -1000 and 1000, and checks if `i^5 - j^5` equals the input `x`. If it does, it prints `i` and `j` and returns from the program. If it doesn't find any such pair, it will print nothing and return from the program.
