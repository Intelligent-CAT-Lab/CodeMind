Here is the Java version of the Python code:

```java
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String S = "3-2*3$";
        System.out.println(parse(S));
    }

    public static int parse(String S) {
        List<Character> code = Arrays.asList('+', '-', '*');
        int cur = 0;
        return expr(S, code, cur, 0);
    }

    public static int expr(String S, List<Character> code, int cur, int level) {
        char op = '+';
        int result = 0;
        while (true) {
            if (level == 2) {
                result += number(S, cur);
            } else {
                result += expr(S, code, cur, level + 1);
            }
            if (cur >= S.length()) {
                break;
            }
            char c = S.charAt(cur);
            if (!code.contains(c) || code.indexOf(c) != level) {
                break;
            }
            op = c;
            cur++;
        }
        return result;
    }

    public static int number(String S, int cur) {
        int num = 0;
        while (cur < S.length() && Character.isDigit(S.charAt(cur))) {
            num = 10 * num + Character.getNumericValue(S.charAt(cur));
            cur++;
        }
        return num;
    }
}
```

This Java code does the same thing as the Python code. It parses an expression and evaluates it. The `parse` method is the main entry point, which calls `expr` with the initial level of precedence. The `expr` method recursively parses the expression, and the `number` method parses a number. The `main` method reads the input from the command line and prints the result.
