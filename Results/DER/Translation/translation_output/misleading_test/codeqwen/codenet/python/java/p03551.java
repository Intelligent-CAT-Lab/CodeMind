Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        int time = 1900 * M + (N - M) * 100;
        System.out.println(time * (1 << M));
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, calculates the time, and then prints the result. The `<<` operator in Java is equivalent to the `**` operator in Python, and it performs a left shift operation.
