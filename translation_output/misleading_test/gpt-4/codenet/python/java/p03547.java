Below is the translated code from Python to Java:

```java
import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        String N = parts[0];
        String M = parts[1];

        // Convert hexadecimal alphabetic characters to their numeric values
        int intN = convertHexCharToDecimal(N.charAt(0));
        int intM = convertHexCharToDecimal(M.charAt(0));

        if (intN > intM) {
            System.out.println(">");
        } else if (intN == intM) {
            System.out.println("=");
        } else {
            System.out.println("<");
        }
        
        scanner.close();
    }

    private static int convertHexCharToDecimal(char hexChar) {
        switch(hexChar) {
            case 'A':
                return 10;
            case 'B':
                return 11;
            case 'C':
                return 12;
            case 'D':
                return 13;
            case 'E':
                return 14;
            case 'F':
                return 15;
            default:
                // Assuming input will be valid ('A' to 'F'), else we'll treat as numeral character
                return Character.getNumericValue(hexChar);
        }
    }
}
```

This Java code assumes inputs will be one hex digit (A to F or 0-9) and provides comparison functionality similar to the provided Python code. The example test input "A B" will result in the expected output, with an empty line before it due to how the `nextLine()` method works in Java. If you want to omit the empty line before the output, you can use `scanner.next()` instead, which will only read the next word, not the entire line. However, you then need to separately handle the input for both `N` and `M`.
