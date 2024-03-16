Here's the equivalent Java code for the provided Python script:

```java
import java.util.Scanner;

public class ChickenEgg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int i = 0, c = 0, p = 0;
        char b = '\0', r = '\0';

        while (i < s.length()) {
            if (s.charAt(i) == b) {
                if (c > p) {
                    r = b;
                    p = c;
                }
                c = 0;
            }
            b = s.charAt(i);
            i += (s.charAt(i) == 'c') ? 7 : 3;
            c++;
        }
        if (c > p) {
            r = b;
        }
        System.out.println((r == 'e') ? "egg" : "chicken");
        scanner.close();
    }
}
```

Please note that Java is a statically-typed language, so we need to declare variable types. Also, Java does not support the increment of an integer variable by an array or list directly as in Python, so I used a ternary conditional operator to decide whether to add 3 or 7 to `i`. The input reading and print operations are also adapted to Java's syntax.
