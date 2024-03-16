Here is the translated code in Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        scanner.close(); // close the scanner

        char a = input.charAt(0);
        char b = input.charAt(1);
        char c = input.charAt(2);
        char d = input.charAt(3);

        int flag = 0;
        if (a == b && c == d) {
            flag = 1;
        } else if (a == c && b == d) {
            flag = 1;
        } else if (a == d && b == c) {
            flag = 1;
        } else {
            flag = 0;
        }

        if (a == b && a == c && a == d) {
            flag = 0;
        }

        if (flag == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

You can compile and run this Java program, and it should give you the expected output as per the test case. Make sure that when you run this code, it should take a single string "ASSA" as an input, which will be split into characters `a`, `b`, `c`, `d`.
