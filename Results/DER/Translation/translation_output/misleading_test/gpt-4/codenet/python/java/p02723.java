Here's the Java translation of the given Python code including a main method to test with the provided test case:

```java

import java.util.Scanner;

public class StringMatchChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        if (s.charAt(2) == s.charAt(3) && s.charAt(4) == s.charAt(5)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        scanner.close(); // It's a good practice to close the scanner after use
    }
}
```

When you run this Java code and input 'sippuu', it would produce the expected output "Yes".

Please note that you need to make sure the input string length is at least 6 characters to avoid `StringIndexOutOfBoundsException`. The Python code assumes the input always satisfies this condition, but the Java code should ideally include error checking to handle such cases gracefully.
