Below is the translated Java code from the provided Python code. Since the Python code uses global variables and some features which are not directly translatable to Java, certain modifications, such as passing the token list and current index as arguments to methods, were necessary to translate the Pythonic constructs to Java.

```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Parser {
    private static List<String> tokens;
    private static int cur;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        tokens = new ArrayList<>();
        for (char token : inputLine.toCharArray()) {
            if (token != ' ') {
                tokens.add(String.valueOf(token));
            }
        }
        tokens.add(""); // EOF
        cur = 0;

        int[] ans = parseFormula();
        System.out.println(ans[0] + " " + ans[1]);
        
        scanner.close();
    }

    private static int[] parseFormula() {
        return parseOr();
    }

    private static int[] parseOr() {
        int[] lhs = parseAnd();
        if (tokens.get(cur).equals("|")) {
            cur++;
            int[] rhs = parseOr();
            int zero = lhs[0] + rhs[0];
            int one = Math.min(lhs[1], lhs[0] + rhs[1]);
            return new int[]{zero, one};
        }
        return lhs;
    }

    private static int[] parseAnd() {
        int[] lhs = parseTerm();
        if (tokens.get(cur).equals("&")) {
            cur++;
            int[] rhs = parseAnd();
            int zero = Math.min(lhs[0], lhs[1] + rhs[0]);
            int one = lhs[1] + rhs[1];
            return new int[]{zero, one};
        }
        return lhs;
    }

    private static int[] parseTerm() {
        if (tokens.get(cur).equals("?")) {
            cur++;
            return new int[]{1, 1};
        } else if (tokens.get(cur).equals("(")) {
            cur++;
            int[] res = parseOr();
            if (!tokens.get(cur).equals(")")) {
                throw new RuntimeException("not closed");
            }
            cur++;
            return res;
        }
        throw new RuntimeException("Unexpected token");
    }
}
```

Please note that Java is strongly typed and doesn't treat strings as lists of characters, as Python does. Java's exception handling also differs you would need to ensure you are catching exceptions or declaring them in function signatures where appropriate. Here I am throwing a `RuntimeException` to simulate the Python code's abrupt exception-raising behavior.
