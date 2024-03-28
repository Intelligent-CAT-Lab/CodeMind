Here is the equivalent Java code that performs the same computation as the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int d = scanner.nextInt();
        int x = scanner.nextInt();
        scanner.close();

        double result = calculateResult(N, d, x);
        System.out.printf("%.15f%n", result);
    }

    public static double calculateResult(int N, int d, int x) {
        double ret = 0;
        double dD = d;
        double xX = x;

        while (N > 0) {
            ret += dD + (N - 0.5) * xX;
            dD = dD + (dD / N) + (5 * xX) / (2 * N);
            xX += 2 * xX / N;
            N -= 1;
        }
        return ret;
    }
}
```

To compile and run this Java program, you can use:
```shell
javac Main.java
java Main
```

Then input:
```text
1 3 3
```

The expected output is:
```text
4.500000000000000
```

Note that the `printf` function is used with a format specifier `%.15f` to match the precision of the python code.
