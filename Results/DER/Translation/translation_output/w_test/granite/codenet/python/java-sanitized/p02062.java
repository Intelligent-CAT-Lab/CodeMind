import java.util.*;

public class p02062 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] tokens = input.toCharArray();
        int cur = 0;

        int[] ans = parseFormula(tokens);
        System.out.println(ans[0] + " " + ans[1]);
    }

    public static int[] parseFormula(char[] tokens) {
        int[] res = parseOr(tokens);
        if (tokens[cur]!= ')') {
            throw new RuntimeException("not closed");
        }
        cur++;
        return res;
    }

    public static int[] parseOr(char[] tokens) {
        int[] lhs = parseAnd(tokens);
        if (tokens[cur] == '|') {
            cur++;
            int[] rhs = parseOr(tokens);
            int zero = lhs[0] + rhs[0];
            int one = Math.min(lhs[1], lhs[0] + rhs[1]);
            return new int[]{zero, one};
        }
        return lhs;
    }

    public static int[] parseAnd(char[] tokens) {
        int[] lhs = parseTerm(tokens);
        if (tokens[cur] == '&') {
            cur++;
            int[] rhs = parseAnd(tokens);
            int zero = Math.min(lhs[0], lhs[1] + rhs[0]);
            int one = lhs[1] + rhs[1];
            return new int[]{zero, one};
        }
        return lhs;
    }

    public static int[] parseTerm(char[] tokens) {
        if (tokens[cur] == '?') {
            cur++;
            return new int[]{1, 1};
        } else if (tokens[cur] == '(') {
            cur++;
            int[] res = parseOr(tokens);
            if (tokens[cur]!= ')') {
                throw new RuntimeException("not closed");
            }
            cur++;
            return res;
        }
        throw new RuntimeException("invalid token");
    }
}