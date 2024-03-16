Below is the translated Java code that performs the same functionality as the provided Python code:

```java
import java.util.Scanner;

public class BalanceScale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();

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

You can run a test case in Java by compiling and running the `BalanceScale` class and then inputting the test case "3 8 7 1" on standard input. The expected output for this input would be "Left", as per the provided example.
