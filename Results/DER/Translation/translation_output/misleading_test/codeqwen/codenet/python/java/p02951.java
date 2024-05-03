Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int get = A - B;

        int i = C - get;

        if (i < 0) {
            i = 0;
        }

        System.out.println(i);
    }
}
```

This Java code does the same thing as your Python code. It reads three integers from the user, calculates the difference between the first two integers, subtracts that difference from the third integer, and then prints the result. If the result is less than zero, it sets the result to zero.
