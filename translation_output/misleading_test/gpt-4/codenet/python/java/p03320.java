Below is the translated Java code based on the provided Python code. This code reads an integer value from the standard input, performs calculations, and prints the result to the standard output.

```java
import java.util.Scanner;

public class Main {

    static int snuke(int x) {
        int a = 0;
        while (x > 0) {
            a += x % 10;
            x /= 10;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int a = 0;
        int d = 1;

        for (int i = 1; i <= K; i++) {
            int x = a + d;
            int y = a + 10 * d;
            if ((double) x / snuke(x) <= (double) y / snuke(y)) {
                a = x;
            } else {
                a = y;
                d *= 10;
            }
            System.out.println(a);
        }

        scanner.close();
    }
}
```

When you run this Java program, it will prompt for an integer input, for which you can enter "10", and then it will output the expected series of integers, as specified in your test case.

Please note that in Java, integer division truncates the result, so it's necessary to cast one operand to `double` to ensure floating-point division is performed, which mimics the behavior of the division in Python.
