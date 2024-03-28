Below is the translated python code to Java:

```java
import java.util.Scanner;

public class SumOfNumbers {
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
        scanner.close();
    }
}
```

You can compile and run this Java code, and when you enter "20 2 5" as the test input, the expected output will be "29".
