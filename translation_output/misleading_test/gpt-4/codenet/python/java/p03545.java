Here's the equivalent Java code for the provided Python code:

```java
import java.util.Scanner;

public class CalculateSumToSeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        int a = Character.getNumericValue(input.charAt(0));
        int b = Character.getNumericValue(input.charAt(1));
        int c = Character.getNumericValue(input.charAt(2));
        int d = Character.getNumericValue(input.charAt(3));

        if (a + b + c + d == 7) {
            System.out.println(a + "+" + b + "+" + c + "+" + d + "=7");
        } else if (a + b + c - d == 7) {
            System.out.println(a + "+" + b + "+" + c + "-" + d + "=7");
        } else if (a + b - c + d == 7) {
            System.out.println(a + "+" + b + "-" + c + "+" + d + "=7");
        } else if (a + b - c - d == 7) {
            System.out.println(a + "+" + b + "-" + c + "-" + d + "=7");
        } else if (a - b + c + d == 7) {
            System.out.println(a + "-" + b + "+" + c + "+" + d + "=7");
        } else if (a - b + c - d == 7) {
            System.out.println(a + "-" + b + "+" + c + "-" + d + "=7");
        } else if (a - b - c + d == 7) {
            System.out.println(a + "-" + b + "-" + c + "+" + d + "=7");
        } else if (a - b - c - d == 7) {
            System.out.println(a + "-" + b + "-" + c + "-" + d + "=7");
        }

        scanner.close();
    }
}
```
This Java code includes the necessary import statement for the Scanner class, prompts for user input, and performs the same checks as the Python code to determine what combination of the four digits leads to a sum of 7, and then prints out the equation with the appropriate signs.
