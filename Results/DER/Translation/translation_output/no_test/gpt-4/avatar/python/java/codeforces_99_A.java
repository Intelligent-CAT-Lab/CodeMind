Here is the translated code from Python to Java:

```java
import java.util.Scanner;

public class NumCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] num = scanner.nextLine().split("\\. ");
        int lastDigitBeforePoint = Character.getNumericValue(num[0].charAt(num[0].length() - 1));

        if (lastDigitBeforePoint == 9) {
            System.out.println("GOTO ▁ Vasilisa.");
        } else {
            if (Character.getNumericValue(num[1].charAt(0)) >= 5) {
                System.out.println(Integer.parseInt(num[0]) + 1);
            } else {
                System.out.println(num[0]);
            }
        }
        
        scanner.close();
    }
}
```

Please note a few differences between Python and Java:

1. In Java, you need to use a `Scanner` for command-line input.
2. The `split` function in Java works with regular expressions, so you should escape the dot `.` since in regex . (dot) has a special meaning as a wildcard for any character.
3. Array and character handling in Java requires a more explicit approach. You retrieve a character and convert it to a numeric value using `Character.getNumericValue()`.
4. `print` and `input` are not available in Java as they are in Python; you should use `System.out.println()` for output and `Scanner` methods for input.
5. Java requires data types to be defined for all variables, and statement blocks to be enclosed in braces `{}`.
