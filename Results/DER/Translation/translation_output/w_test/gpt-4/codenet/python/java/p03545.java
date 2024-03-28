Here's the translation of your Python code to Java:

```java
import java.util.Scanner;

public class SumSeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String n = scanner.next();
        
        int a = Character.getNumericValue(n.charAt(0));
        int b = Character.getNumericValue(n.charAt(1));
        int c = Character.getNumericValue(n.charAt(2));
        int d = Character.getNumericValue(n.charAt(3));
        
        if ((a + b + c + d) == 7) {
            System.out.println(a + "+" + b + "+" + c + "+" + d + "=7");
        } else if ((a + b + c - d) == 7) {
            System.out.println(a + "+" + b + "+" + c + "-" + d + "=7");
        } else if ((a + b - c + d) == 7) {
            System.out.println(a + "+" + b + "-" + c + "+" + d + "=7");
        } else if ((a + b - c - d) == 7) {
            System.out.println(a + "+" + b + "-" + c + "-" + d + "=7");
        } else if ((a - b + c + d) == 7) {
            System.out.println(a + "-" + b + "+" + c + "+" + d + "=7");
        } else if ((a - b + c - d) == 7) {
            System.out.println(a + "-" + b + "+" + c + "-" + d + "=7");
        } else if ((a - b - c + d) == 7) {
            System.out.println(a + "-" + b + "-" + c + "+" + d + "=7");
        } else if ((a - b - c - d) == 7) {
            System.out.println(a + "-" + b + "-" + c + "-" + d + "=7");
        }
        
        scanner.close();
    }
}
```

Here's what is different in the Java code compared to the Python code:
1. Java requires the class and method definitions (`public class SumSeven` and `public static void main(String[] args)`),
2. We use a Scanner to read input from the console,
3. We are using `Character.getNumericValue()` to convert each `char` of the string to an `int`,
4. We include semicolons at the end of each statement,
5. We use `System.out.println` for printing to the console,
6. We are closing the Scanner at the end to release resources associated with it.
