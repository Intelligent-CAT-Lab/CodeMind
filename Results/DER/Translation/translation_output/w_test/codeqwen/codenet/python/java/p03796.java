Here is the Java equivalent of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(factorial(n) % 1000000007);
    }

    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
```

This Java program reads an integer from the user, calculates its factorial using a recursive function, and then prints the result modulo 1000000007. The factorial function is defined to handle the base case where n is 0, and for all other cases, it recursively calls itself with n-1 and multiplies the result by n.
