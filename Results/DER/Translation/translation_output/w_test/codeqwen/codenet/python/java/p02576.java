Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int T = scanner.nextInt();
        
        if (N % X != 0) {
            System.out.println((N / X) * T + T);
        } else {
            System.out.println((N / X) * T);
        }
    }
}
```

This Java code does the same thing as your Python code. It reads three integers from the user, calculates the result, and prints it. The `Scanner` class is used to read the input from the user. The `/` operator is used for integer division in Java, which is equivalent to the `//` operator in Python.
