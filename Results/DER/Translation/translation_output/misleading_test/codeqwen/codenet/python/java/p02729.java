Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int even = n * (n-1) / 2;
        int odd = m * (m-1) / 2;

        System.out.println(even + odd);
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, calculates the number of even and odd numbers in the range from 1 to each of these integers, and then prints the sum of these two numbers.
