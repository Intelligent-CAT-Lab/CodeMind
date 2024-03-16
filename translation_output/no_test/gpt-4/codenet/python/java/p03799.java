Below is the Java translation of the Python code you provided:

```java
import java.util.Scanner;

public class Main {

    private static int INT() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static int[] MI() {
        Scanner scanner = new Scanner(System.in);
        String[] parts = scanner.nextLine().split(" ");
        int[] numbers = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            numbers[i] = Integer.parseInt(parts[i]);
        }
        return numbers;
    }

    public static void main(String[] args) {
        int[] input = MI();
        int N = input[0];
        int M = input[1];

        int ans;
        if (2 * N <= M) {
            ans = N + (M - 2 * N) / 4;
        } else {
            ans = M / 2;
        }

        System.out.println(ans);
    }
}
```

Note a few important differences between the Python and Java code:

1. In Python, you can use `input()` to read user input. In Java, the standard way is to use a `Scanner` object, which should be created just once and reused for reading multiple inputs. I have opted to create it directly within the methods for clarity, but in an optimized program, you would usually instantiate it once and pass it as a parameter to prevent the unnecessary creation of multiple Scanner instances.

2. In Python, `split()` method divides the string based on whitespace by default. In Java, `split(" ")` has been used to explicitly define space as the delimiter.

3. Integer division in both Python and Java truncates decimal points, so the division operator behaves the same in this context (/).

4. The Python `map()` function is replaced by explicitly parsing each string to an integer after splitting.

5. In Java, you must declare the type of each variable, methods have return types, and the main method is static, as Java is a statically typed language.
