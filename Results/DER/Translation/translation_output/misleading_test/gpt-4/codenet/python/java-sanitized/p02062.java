import java.util.Scanner;

public class p02062 {

    private static int cur = 0;
    private static char[] tokens;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        tokens = input.replace(" ", "").toCharArray();
        int n = tokens.length + 1;
        tokens = java.util.Arrays.copyOf(tokens, n);
        tokens[n - 1] = ' '; // Using space as EOF

        int[] ans = parseFormula();
        System.out.println(ans[0] + " " + ans[1]);

        scanner.close();
    }

    private static int[] parseFormula() {
        return parseOr();
    }

    private static int[] parseOr() {
        int[] lhs = parseAnd();
        if (tokens[cur] == '|') {
            cur += 1;
            int[] rhs = parseOr();
            int zero = lhs[0] + rhs[0];
            int one = Math.min(lhs[1], lhs[0] + rhs[1]);
            return new int[]{zero, one};
        }
        return lhs;
    }

    private static int[] parseAnd() {
        int[] lhs = parseTerm();
        if (tokens[cur] == '&') {
            cur += 1;
            int[] rhs = parseAnd();
            int zero = Math.min(lhs[0], lhs[1] + rhs[0]);
            int one = lhs[1] + rhs[1];
            return new int[]{zero, one};
        }
        return lhs;
    }

    private static int[] parseTerm() {
        if (tokens[cur] == '?') {
            cur += 1;
            return new int[]{1, 1};
        } else if (tokens[cur] == '(') {
            cur += 1;
            int[] res = parseOr();
            if (tokens[cur] != ')') {
                throw new RuntimeException("not closed");
            }
            cur += 1;
            return res;
        }
        throw new RuntimeException("unexpected character");
    }
}