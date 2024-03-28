Below is the Java translation of the given Python code. The translated Java code reads an integer from the standard input, calculates the value of `w` based on the provided formula, and then prints certain numbers as per the original Python script.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int w = 0;

        // Find w such that w(w + 1)/2 < N <= (w + 1)(w + 2)/2
        for (int i = 0; i < 100000; i++) { // 10 ** 5 is written as 100000 in Java
            if (i * (i + 1) / 2 < N && N <= (i + 1) * (i + 2) / 2) {
                w = i + 1;
                break;
            }
        }

        // Print and subtract values from N, starting from w down to 1
        for (int i = w; i > 0; i--) {
            if (N >= i) {
                System.out.println(i);
                N -= i;
            }
        }

        scanner.close();
    }
}
```

Be sure to include this Java code inside a file with a `Main` class as it's using the `main` method as the entry point of the program. This code can be compiled and executed in a Java environment, and you would provide the input just like in the Python code, i.e., by typing an integer into the standard input.
