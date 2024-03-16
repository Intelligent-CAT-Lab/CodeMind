Below is the equivalent Java code for the provided Python snippet. The code reads three integers from the standard input (a, b, k) and performs the calculations as per the logic in the Python code.

```java
import java.util.Scanner;

public class Banknotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();

        if (a <= k) {
            k -= a;
            a = 0;
        } else {
            System.out.println((a - k) + " " + b);
            System.exit(0);
        }
        System.out.println(0 + " " + Math.max(b - k, 0));
    }
}
```

To compile and run the Java code, you can follow these steps:

1. Save the code in a file named `Banknotes.java`.
2. Open a terminal/command prompt and navigate to the directory containing the saved file.
3. Compile the Java program with the command `javac Banknotes.java`.
4. Run the compiled Java program with the command `java Banknotes`.
5. Input your test case (e.g., "2 3 3") and press Enter.
6. You should see the expected output ("0 2") printed to the standard output.

Note: Java does not have a direct equivalent of Python's `exit()`, but `System.exit(0)` achieves a similar termination of the program.
