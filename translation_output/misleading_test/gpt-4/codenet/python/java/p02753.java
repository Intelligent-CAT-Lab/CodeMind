Here's the equivalent code in Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();

        if (S.equals("AAA") || S.equals("BBB")) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }

        scanner.close();
    }
}
```

When you run this Java program, it will wait for the user input, just like the given Python code. After you input "ABA" (without quotes) and press Enter, it will output "Yes".

To test the code with the provided test case:
Input: ABA
Expected Output: Yes
