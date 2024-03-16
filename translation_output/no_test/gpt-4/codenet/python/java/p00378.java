```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading input from user
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int X = scanner.nextInt();

        int k = X / 1000;
        int ans = k * Math.min(A, 2*B);
        int r = X - 1000*k;

        // Computing the additional cost based on the remainder 'r'
        if (0 < r && r <= 500) {
            ans += Math.min(A, B);
        } else if (500 < r) {
            ans += Math.min(A, 2*B);
        }

        // Output the result
        System.out.println(ans);

        scanner.close();
    }
}
```
In Java, input is typically handled with a Scanner object. The division and modulo operations translate directly between Python and Java. Note that Java is statically typed, so variable types are declared explicitly (`int` in this case). The `Math.min()` function in Java is used for finding the minimum of two values, similar to Python's `min()` function.
