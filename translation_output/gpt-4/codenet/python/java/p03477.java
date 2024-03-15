Here's the translated Python code into Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the inputs
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        
        // Compare the sums and print the result
        if (A + B < C + D) {
            System.out.println("Right");
        } else if (A + B == C + D) {
            System.out.println("Balanced");
        } else {
            System.out.println("Left");
        }
        
        scanner.close();
    }
}
```

This Java program will perform the same actions as the given Python code. It reads four integer values, compares the sums of the first pair `A+B` with the second pair `C+D`, and prints the result according to the condition.
