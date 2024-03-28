Here's the translated Java code for the given Python program:

```java
import java.util.Scanner;

public class DateFormatChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();

        int a = Integer.parseInt(n.substring(0, 2));
        int b = Integer.parseInt(n.substring(2, 4));

        if (b == 0 || b > 12) {
            if (1 <= a && a <= 12) {
                System.out.println("MMYY");
            } else {
                System.out.println("NA");
            }
        } else if (1 <= a && a <= 12) {
            System.out.println("AMBIGUOUS");
        } else {
            System.out.println("YYMM");
        }
        
        scanner.close();
    }
}
```

And here is an example of how you would run the Java program with the test input `1905`:

```plaintext
1905
```

And the expected Java output would be:

```plaintext
YMM
```

Note: However, there seems to be an inconsistency between the test case's expected output and the original Python code functionality. The Python code prints "AMBIGUOUS" for inputs such as "1905" because both "19" and "05" are valid month values (when interpreted as YYMM and MMYY respectively). If the expected output is indeed "YMM" then there must be a typo, and the actual output should be "AMBIGUOUS".
