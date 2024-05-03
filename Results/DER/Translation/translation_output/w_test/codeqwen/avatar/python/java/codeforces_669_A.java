Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n % 3 == 0) {
            System.out.println(n / 3 * 2);
        } else if (n < 3) {
            System.out.println(1);
        } else {
            System.out.println(n / 3 * 2 + 1);
        }
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the user, checks if it's divisible by 3, and prints the appropriate result. If the number is less than 3, it prints 1. Otherwise, it prints the result of dividing the number by 3, multiplying by 2, and adding 1.
