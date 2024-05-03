Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int ans = b;
        if (n * a > b) {
            ans = n * a;
        }

        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the user, calculates the product of the first two integers and compares it to the third integer. If the product is greater than the third integer, it assigns the product to the variable `ans`, otherwise it assigns the third integer to `ans`. Finally, it prints the value of `ans`.
