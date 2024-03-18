import java.util.Scanner;

public class p02062 {

    static char[] tokens;
    static int cur;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        tokens = input.toCharArray();
        parseFormula();
    }

    static void parseFormula() {
        int[] ans = parseOr();
        System.out.println(ans[0] + " " + ans[1]);
    }

    static int[] parseOr() {
        int[] lhs = parseAnd();
        if (tokens[cur] == '|') {
            cur++;
            int[] rhs = parseOr();
            int zero = lhs[0] + rhs[0];
            int one = Math.min(lhs[1], lhs[0] + rhs[1]);
            return new int[]{zero, one};
        }
        return lhs;
    }

    static int[] parseAnd() {
        int[] lhs = parseTerm();
        if (tokens[cur] == '&') {
            cur++;
            int[] rhs = parseAnd();
            int zero = Math.min(lhs[0], lhs[1] + rhs[0]);
            int one = lhs[1] + rhs[1];
            return new int[]{zero, one};
        }
        return lhs;
    }

    static int[] parseTerm() {
        if (tokens[cur] == '?') {
            cur++;
            return new int[]{1, 1};
        } else if (tokens[cur] == '(') {
            cur++;
            int[] res = parseOr();
            if (tokens[cur] != ')') {
                throw new RuntimeException("Parenthesis not closed");
            }
            cur++;
            return res;
        }
        return new int[]{0, 0}; // Handle unexpected characters
    }
}