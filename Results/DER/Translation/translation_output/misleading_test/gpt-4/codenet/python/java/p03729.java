Below is the translation of the provided Python code to Java. It reads a string of text, splits it into three parts, and then checks the last character of the first string with the first character of the second string, and the last character of the second string with the first character of the third string.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(" ");

        // Ensure there are exactly three words before proceeding
        if (parts.length == 3) {
            String a = parts[0];
            String b = parts[1];
            String c = parts[2];

            if (a.charAt(a.length() - 1) == b.charAt(0) && b.charAt(b.length() - 1) == c.charAt(0)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("Input does not contain three words.");
        }

        scanner.close();
    }
}
```

To test the Java code with the provided test input, you could run the Java program and enter "rng gorilla apple" when prompted for input. It should output "YES" as expected.
