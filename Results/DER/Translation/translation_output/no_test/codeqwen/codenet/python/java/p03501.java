Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        System.out.println(Math.min(A * N, B));
    }
}
```

This Java code does the same thing as your Python code. It reads three integers from the user, calculates the minimum of the product of the first two integers and the third integer, and then prints the result.
