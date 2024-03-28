Below is the equivalent Java code for the provided Python code. The code reads three space-separated integers from the standard input, processes them, and prints the result with six decimal places of precision.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read space-separated integers a, t, r
        int a = scanner.nextInt();
        int t = scanner.nextInt();
        int r = scanner.nextInt();

        // Calculate the answer
        double ans = (double) r * t / a;

        // Print the answer formatted to six decimal places
        System.out.printf("%.6f%n", ans);

        scanner.close();
    }
}

```

To compile and run this program, you would use `javac Main.java` to compile and `java Main` to run it in a terminal window, assuming the file is named `Main.java`. When you run it, you'll need to input the test case, "180 120 90", and should receive the expected output, "5.036376".
