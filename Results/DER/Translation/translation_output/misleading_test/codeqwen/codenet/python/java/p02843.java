Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int q = N / 100;
        int mod = N % 100;
        System.out.println(1 <= mod && mod <= q * 5 ? 1 : 0);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the user, calculates the quotient and remainder when divided by 100, and then prints 1 if the remainder is less than or equal to 5 times the quotient, otherwise it prints 0.
