Here is the translated Java code:

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
            int rest_num_exchanges = K - (A + 1);
            int gain_per_two_manipulation = B - A;
            int num_cookies = (rest_num_exchanges / 2) * gain_per_two_manipulation + B;
            if (rest_num_exchanges % 2 == 1) {
                num_cookies += 1;
            }
            System.out.println(num_cookies);
        }

        scanner.close();
    }
}
```

Some key differences to note when converting from Python to Java:
- Declaration of variables includes their type in Java.
- `Scanner` is used to read input from the user in Java, instead of `input()` in Python.
- Division in Java between two integers will have an integer result, similar to the `//` operator in Python.
- The `println` method is used in Java to output to the console.
- All code in Java must be inside a class, and the entry point is the `main` method.
