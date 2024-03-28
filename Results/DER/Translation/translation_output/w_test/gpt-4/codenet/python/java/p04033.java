Here is the Python code translated into Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a <= 0 && b >= 0) {
            System.out.println("Zero");
        } else if (b < 0) {
            if ((b - a + 1) % 2 == 1) {
                System.out.println("Negative");
            } else {
                System.out.println("Positive");
            }
        } else {
            System.out.println("Positive");
        }
        
        scanner.close();
    }
}
```
This Java program simulates the behavior of the provided Python code. It reads two integers as input, uses conditions to determine the output, and prints the appropriate result to the console, whether the product of the range is "Zero," "Negative," or "Positive." To run a test case, you can compile and execute this program, and then type "1 3" (without quotation marks) followed by Enter as provided in your test input. The expected output, "Positive," will be displayed in the console.
