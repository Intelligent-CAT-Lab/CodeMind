Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        System.out.println(N <= K ? 1 : 0);
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, compares them, and prints 1 if the first integer is less than or equal to the second integer, and 0 otherwise.
