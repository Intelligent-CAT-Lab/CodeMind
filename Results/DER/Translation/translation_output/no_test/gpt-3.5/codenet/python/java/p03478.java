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
            String nStr = Integer.toString(n_i);
            for (int j = 0; j < nStr.length(); j++) {
                n_orders_sum += Character.getNumericValue(nStr.charAt(j));
            }
            if (a <= n_orders_sum && n_orders_sum <= b) {
                sum += n_i;
            }
        }

        System.out.println(sum);
    }
}
```
