Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        int A = Integer.parseInt(numbers[0]);
        int B = Integer.parseInt(numbers[1]);
        int C = Integer.parseInt(numbers[2]);
        int D = Integer.parseInt(numbers[3]);

        if (A + B < C + D) {
            System.out.println("Right");
        } else if (A + B == C + D) {
            System.out.println("Balanced");
        } else {
            System.out.println("Left");
        }
    }
}
```

This Java code does the same thing as your Python code. It reads four integers from the user, adds them together, and then compares the sums to determine which message to print.
