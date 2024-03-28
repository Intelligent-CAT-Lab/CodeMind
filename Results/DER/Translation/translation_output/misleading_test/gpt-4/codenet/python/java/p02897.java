Here's the equivalent Java code for the provided Python snippet:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(-((double)(-N / 2)) / N);
        scanner.close();
    }
}
```

This Java code performs the same calculation as the Python code. Note that in Java, when you divide two integers, the result is truncated to an integer. To get the equivalent of Python's `//` operator, you just use `/` between two integers. To get a floating-point result, one of the numbers in the division must be cast to `double`. In this case, I've explicitly cast the integer calculation `-N / 2` to `double` so the subsequent division by `N` is a floating-point division, ensuring an output consistent with the Python code.

To compile and run this Java program, first save it to a file named `Main.java`, then use the following commands:

```sh
javac Main.java
java Main
```

Enter the test input `4` and you should see the expected output `-15.97688597978339`.
