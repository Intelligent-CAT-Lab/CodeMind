Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int sum = 0;
        for (int n_i = 1; n_i <= n; n_i++) {
            int n_orders_sum = 0;
            for (char n_order_i : String.valueOf(n_i).toCharArray()) {
                n_orders_sum += Character.getNumericValue(n_order_i);
            }
            if (a <= n_orders_sum && n_orders_sum <= b) {
                sum += n_i;
            }
        }
        System.out.println(sum);
    }
}
```

This Java code does the same thing as your Python code. It reads three integers from the user, calculates the sum of the digits of each number from 1 to n (inclusive), and then adds the number to the sum if the sum of its digits is between a and b (inclusive). Finally, it prints the sum.
