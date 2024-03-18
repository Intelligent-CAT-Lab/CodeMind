Here's the equivalent Java code for the Python snippet you provided. The Java code reads three integers from the standard input, then calculates and prints the number of integers divisible by `d` between `L` and `R` (inclusive).

```java
import java.util.Scanner;

public class DivisibleCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        int R = scanner.nextInt();
        int d = scanner.nextInt();
        int ans = 0;

        for (int i = L; i <= R; i++) {
            if (i % d == 0) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}
```

To run this Java program with the test input `5 10 2` and check for the expected output `82`, you would compile and run the program, then enter the input when prompted. Here's how you can compile and run the Java code on your machine:

1. Save the code to a file named `DivisibleCount.java`.
2. Open a terminal or command prompt.
3. Navigate to the directory where you saved the file.
4. Compile the Java code using `javac DivisibleCount.java`.
5. Run the compiled code with `java DivisibleCount`.
6. Enter the test input: `5 10 2`.
7. The program will print the output, which should be `82`.

Please note that due to the static nature of Java methods and variables, we have encapsulated the functionality in the `main` method of a public class named `DivisibleCount`. Also, unlike Python's `print` which implicitly converts integer to string, Java's `System.out.println()` directly accepts an integer and prints it to the standard output.
