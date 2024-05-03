Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x = scanner.nextInt();
        scanner.close();

        int d = a - b;
        int n = Math.max(0, (x - b) / d);
        int ans = x + n * b;
        System.out.println(ans % 1000000007);
    }
}
```

This Java code does the same thing as your Python code. It reads three integers from the user, calculates the difference between the first and second integers, finds the number of times the difference can be added to the second integer to get a number greater than or equal to the third integer, adds this number of differences to the second integer, and then prints the result modulo 1000000007.
