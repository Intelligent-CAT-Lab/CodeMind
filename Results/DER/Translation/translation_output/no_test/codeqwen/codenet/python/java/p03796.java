Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(factorial(n) % 1000000007);
    }

    public static long factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the user, calculates the factorial of that integer using a recursive function, and then prints the result modulo 1000000007.
