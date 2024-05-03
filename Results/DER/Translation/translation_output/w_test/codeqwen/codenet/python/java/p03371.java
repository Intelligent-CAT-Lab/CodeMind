Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int X = scanner.nextInt();
        int Y = scanner.nextInt();

        int mi = Math.min(X, Y);
        int a = A * X + B * Y;
        int b = mi * C * 2 + A * (X - mi) + B * (Y - mi);
        int c = Math.max(X, Y) * C * 2;

        System.out.println(Math.min(a, b, c));
    }
}
```

This Java code does the same thing as your Python code. It reads the input from the user, calculates the minimum and maximum values of X and Y, and then computes the three possible values of the expression A*X + B*Y, mi*C*2 + A*(X-mi) + B*(Y-mi), and max(X, Y)*C*2. It then prints out the minimum of these three values.
