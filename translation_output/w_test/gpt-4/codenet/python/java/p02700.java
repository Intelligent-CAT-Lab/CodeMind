Here's the translated code in Java. This sample Java program assumes the input is provided in a single line, similar to the Python example you've provided.

```java
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        boolean outcome = false; // Indicates if an outcome has been reached

        while (A > 0 && C > 0) {
            C -= B;
            if (C <= 0) {
                System.out.println("Yes");
                outcome = true;
                break;
            }
            A -= D;
            if (A <= 0) {
                System.out.println("No");
                outcome = true;
                break;
            }
        }

        // Just in case there is no outcome, though the logic should always produce one
        if (!outcome) {
            System.out.println("Draw");
        }

        scanner.close();
    }
}
```

Ensure that the input is provided correctly when running this Java program. The Java program uses a `Scanner` to read the input values from `System.in`. The logic inside the `while` loop the same as in the provided Python script, checking the health points of A and C after each attack. The boolean variable `outcome` is just a precaution to handle any unexpected cases where neither A nor C reach 0 or below, which should not happen with the given logic, but it's there to ensure the program always produces an output.
