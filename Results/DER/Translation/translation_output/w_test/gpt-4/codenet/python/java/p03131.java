Here is the equivalent Java code for the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        if (B - A <= 2) {
            System.out.println(K + 1);
        } else {
            int first_num_exchanges = A + 1;
            int rest_num_exchanges = K - first_num_exchanges;
            int gain_per_two_manipulation = B - A;
            int num_cookies = rest_num_exchanges / 2 * gain_per_two_manipulation + B;
            if (rest_num_exchanges % 2 == 1) {
                num_cookies += 1;
            }
            System.out.println(num_cookies);
        }
        scanner.close();
    }
}
```

To test this code using the given test input `4 2 6`, you can run the Java program and enter the values when prompted. The expected output will be `7`, just as in the Python code.
