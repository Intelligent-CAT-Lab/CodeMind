Here's the equivalent Java code for the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a <= 100 && b <= 100) {
            double result = a * b / 3.305785;
            System.out.printf("%.6f", result);
        }

        scanner.close();
    }
}
```

In the above Java code, I've used `Scanner` for input, which is the common way to read input in Java console applications. Also, note that the `printf` format specifier is slightly different in Java; I've used `%.6f` to match the precision of the expected output. If you specifically need four decimal places as in the Python code, you'll need to use `%.4f` instead.

Make sure to compile and run this Java code with the input "15 25" to get the expected output of `113.437508`.
