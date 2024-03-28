Below is the translation of the provided Python code to Java. The Python code uses `sys.stdin` to read inputs, which in Java can be replaced by using a `Scanner` to read from `System.in`. Math functions from `java.lang.Math` are used to replace the Python math functions `ceil`, and `log2`. Since Java does not have direct tuple unpacking like Python, individual variables need to be read separately.

```java
import java.util.Scanner;
import static java.lang.Math.ceil;
import static java.lang.Math.log;
import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        scanner.close();

        int t = n;
        for (int k = 1; k <= ceil(log(n) / log(2)); k++) {
            int d = (int) ceil(pow(n, 1.0 / k));
            int l = 0;
            int r = k;
            while (l + 1 < r) {
                int c = (l + r) / 2;
                if (n <= pow(d - 1, k - c) * pow(d, c)) {
                    r = c;
                } else {
                    l = c;
                }
            }
            t = Math.min(t, (d - 1) * (k - r) + d * r + (k - 1) * a);
        }
        System.out.println(t);
    }
}
```

Please ensure to use this code in the proper way in your Java environment. You may need a class that includes the `main` method and necessary imports, which are provided in the above snippet. This code snippet assumes that the inputs are provided as command-line arguments or through standard input, and the output will be printed to the standard output.
