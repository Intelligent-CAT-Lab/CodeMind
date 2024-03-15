Here is the equivalent Java code for the provided Python script:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();

        int a = Character.getNumericValue(n.charAt(0));
        int b = Character.getNumericValue(n.charAt(1));
        int c = Character.getNumericValue(n.charAt(2));
        int d = Character.getNumericValue(n.charAt(3));

        if ((a+b+c+d) == 7) {
            System.out.println(a + "+" + b + "+" + c + "+" + d + "=7");
        } else if ((a+b+c-d) == 7) {
            System.out.println(a + "+" + b + "+" + c + "-" + d + "=7");
        } else if ((a+b-c+d) == 7) {
            System.out.println(a + "+" + b + "-" + c + "+" + d + "=7");
        } else if ((a+b-c-d) == 7) {
            System.out.println(a + "+" + b + "-" + c + "-" + d + "=7");
        } else if ((a-b+c+d) == 7) {
            System.out.println(a + "-" + b + "+" + c + "+" + d + "=7");
        } else if ((a-b+c-d) == 7) {
            System.out.println(a + "-" + b + "+" + c + "-" + d + "=7");
        } else if ((a-b-c+d) == 7) {
            System.out.println(a + "-" + b + "-" + c + "+" + d + "=7");
        } else if ((a-b-c-d) == 7) {
            System.out.println(a + "-" + b + "-" + c + "-" + d + "=7");
        }

        scanner.close();
    }
}
```

This Java code does the same logic as the Python script. It reads a string from the input, extracts the individual characters as digits, and then computes various expressions to check if they sum up to 7, printing the resulting expression if they do.

Please note that in Java, you typically use `Scanner` for reading input and `System.out.println()` for printing output. Also, Java requires explicit type declarations and the use of `Character.getNumericValue()` to convert the character to an integer.
