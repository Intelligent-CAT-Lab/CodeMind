Here is the equivalent Java code for the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int i = 0;
        int c = 0;
        int p = 0;
        char r = ' ';
        char b = '\0';

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
            c += 1;
        }
        if (c > p) {
            r = b;
        }
        System.out.println((r == 'e') ? "egg" : "chicken");
    }
}
```

Sample test case:
```
Input: eggchickenegg
Output: egg
``` 

Note: In the Java code, instead of using a list to determine the increment value for `i`, we use a ternary operator to achieve the same effect as `[3,7][s[i]=='c']` from the Python code. The `input` function and `print` function from Python are replaced with `Scanner` for input and `System.out.println` for output in Java. Additionally, the character comparison is adjusted to accommodate Java's use of single quotes for `char` and double quotes for `String` literals.
