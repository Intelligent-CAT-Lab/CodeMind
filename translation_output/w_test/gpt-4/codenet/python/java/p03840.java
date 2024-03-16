Here is the Python code translated into Java:

```java
import java.util.Scanner;

public class TetrisPieces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int I = scanner.nextInt();
        int O = scanner.nextInt();
        int T = scanner.nextInt();
        int J = scanner.nextInt();
        int L = scanner.nextInt();
        int S = scanner.nextInt();
        int Z = scanner.nextInt();

        int a = 0;
        if (I > 0 && J > 0 && L > 0) {
            a = ((I - 1) / 2 + (J - 1) / 2 + (L - 1) / 2) * 2 + 3 + O;
        }

        int b = (I / 2 + J / 2 + L / 2) * 2 + O;
        int ans = Math.max(a, b);

        System.out.println(ans);
    }
}
```

Please note that in Java, we need to explicitly import the `Scanner` class to use for input, declare the class `TetrisPieces`, and define the `main` method as the entry point of the program. Also notice the different ways of printing and getting inputs in Java as compared to Python.
