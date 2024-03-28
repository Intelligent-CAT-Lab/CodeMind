Below is the Java translation of the given Python code. The Java code reads an integer from the standard input, computes the result by calling the `attack` method, and then prints the answer to the standard output:

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int ans = attack(H);
        System.out.println(ans);
    }

    public static int attack(int tairyoku) {
        if (tairyoku == 1) {
            return 1;
        } else {
            return 1 + attack(tairyoku / 2) * 2;
        }
    }
}
```

Here are a few notes about the differences between Python and Java that were taken into account for the translation:

- Unlike Python, which is dynamically typed, Java is statically typed. Hence, variables need to have a declared type.
- Instead of using Python's built-in `input()` function to read from the standard input, Java requires the use of a `Scanner` object.
- Java methods must specify a return type, and the `attack` method must be marked `static` since it's called from a static `main` method.
- Java uses camelCase for method names, so `atack` was translated to `attack`.
- The division in Java between two integers naturally performs an integer division, so no explicit casting is needed after the division as in the Python code with `int(tairyoku/2)`.
- Java's `System.out.println` is used to print the result.
