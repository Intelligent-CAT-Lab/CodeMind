Here is the equivalent Java code that performs the same functionality as the provided Python code:

```java
import java.util.Scanner;

public class CheckNumberInInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (input.contains("9")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }
}

// Run this code and input the test value when prompted.
// Test input: 29
// Expected output: Yes
```
To simplify the output to match your exact request ("Ys" instead of "Yes"), you can just modify the `System.out.println("Yes");` line to output the desired string:

```java
System.out.println("Ys");
```

Please note that in Java, the standard practice is to use a capitalized letter at the beginning of each class name, so I've named the class `CheckNumberInInput` as per Java naming conventions.
