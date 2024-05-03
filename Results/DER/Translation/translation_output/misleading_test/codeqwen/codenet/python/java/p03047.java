Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.close();

        System.out.println(N - (K - 1));
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, subtracts the second integer from the first, and then prints the result. The `Scanner` class is used to read input from the user. The `close()` method is called on the `Scanner` object to close it and release the resources it is using.
