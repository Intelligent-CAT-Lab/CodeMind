Here's the equivalent Java code for the Python code you provided:

```java
import java.util.Scanner;

public class CodeFestivalCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String ss = "";
        int p = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (p == 0 && s.charAt(i) == 'C') {
                p = 1;
            } else if (p == 1 && s.charAt(i) == 'F') {
                p = 2;
            }
        }
        
        System.out.println(p == 2 ? "Yes" : "No");
        scanner.close();
    }
}
```

Please note that the Python `input()` function is replaced with `Scanner.nextLine()` in Java, and Python's `len(s)` is replaced with `s.length()` to get the string length in Java. The character indexing is done using `s.charAt(i)` in Java, as opposed to `s[i]` in Python. Lastly, the ternary operator is used in the print statement, `println(p == 2 ? "Yes" : "No")`, to replicate the inline "if-else" from Python.
