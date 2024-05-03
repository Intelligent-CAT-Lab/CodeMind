Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String src = scanner.nextLine();
        char[] tokens = src.toCharArray();
        tokens = removeSpaces(tokens);
        // debug(tokens);

        // "" as EOF
        tokens = addEof(tokens);
        int cur = 0;
        int[] ans = parseFormula(tokens, cur);
        System.out.println(ans[0] + " " + ans[1]);
    }

    private static char[] removeSpaces(char[] tokens) {
        int j = 0;
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i] != ' ') {
                tokens[j++] = tokens[i];
            }
        }
        return Arrays.copyOf(tokens, j);
    }

    private static char[] addEof(char[] tokens) {
        char[] newTokens = new char[tokens.length + 1];
        System.arraycopy(tokens, 0, newTokens, 0, tokens.length);
        newTokens[tokens.length] = '\0';
        return newTokens;
    }

    private static int[] parseFormula(char[] tokens, int cur) {
        return parseOr(tokens, cur);
    }

    private static int[] parseOr(char[] tokens, int cur) {
        int[] lhs = parseAnd(tokens, cur);
        if (tokens[cur] == '|') {
            cur++;
            int[] rhs = parseOr(tokens, cur);
            int zero = lhs[0] + rhs[0];
            int one = Math.min(lhs[1], lhs[0] + rhs[1]);
            return new int[]{zero, one};
        }
        return lhs;
    }

    private static int[] parseAnd(char[] tokens, int cur
