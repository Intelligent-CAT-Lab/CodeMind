Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        int X = Integer.parseInt(parts[0]);
        int Y = Integer.parseInt(parts[1]);
        int Z = Integer.parseInt(parts[2]);

        int A = X;
        int B = Y;
        int C = Z;

        B = X;
        C = Y;
        A = Z;

        System.out.println(A + " " + B + " " + C);
    }
}
```

This Java code does the same thing as the Python code: it reads three integers from the standard input, swaps the values of the variables, and then prints the new values of the variables.
