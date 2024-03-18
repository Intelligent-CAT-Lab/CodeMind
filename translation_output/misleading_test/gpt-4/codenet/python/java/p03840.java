Below is the Python code translated to Java with the sample test case included as a comment:

```java
import java.util.Scanner;

public class TetrisScoreCalculator {
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
            a = (((I - 1) / 2) + ((J - 1) / 2) + ((L - 1) / 2)) * 2 + 3 + O;
        }
        int b = ((I / 2) + (J / 2) + (L / 2)) * 2 + O;
        int ans = Math.max(a, b);

        System.out.println(ans);
        
        scanner.close();
    }
}

// Sample test case (as the main method argument, you would use: 2 1 1 0 0 0 0)
// Expected output:
// -20
```

Notice that in Java, you need to import the Scanner to read from the standard input. Additionally, I encapsulated the code in a `TetrisScoreCalculator` class with a `main` method since Java is class-based and requires an entry point in the program. You can copy and paste this code into a Java environment to run with your specified inputs.

Please note that the expected output for the provided sample test case should not be `-20`. Instead, it seems there might be a mistake. The output should be a non-negative integer as computed by the provided logic. If you are referring to a different problem statement, you should clarify so that the code can be adjusted accordingly.
