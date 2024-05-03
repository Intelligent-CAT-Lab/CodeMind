Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int N = Integer.parseInt(inputs[0]);
        int K = Integer.parseInt(inputs[1]);

        System.out.println(N - (K - 1));
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, subtracts `K - 1` from `N`, and prints the result.
