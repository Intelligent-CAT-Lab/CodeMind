import java.util.*;

public class p02062 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] tokens = input.split(" ");
        // debug(tokens);

        // "" as EOF
        tokens.add("");
        int cur = 0;
        int[] ans = parseFormula(tokens);
        System.out.println(ans[0] + " " + ans[1]);
    }

    public static int[] parseFormula(String[] tokens) {
        int[] lhs = parseAnd(tokens);
        if (tokens[cur] == "|") {
            cur++;
            int[] rhs = parseOr(tokens);
            int zero = lhs[0] + rhs[0];
            int one = Math.min(lhs[1], lhs[0] + rhs[1]);
            return new int[]{zero, one};
        }
        return lhs;
    }

    public static int[] parseAnd(String[] tokens) {
        int[] lhs = parseTerm(tokens);
        if (tokens[cur] == "&") {
            cur++;
            int[] rhs = parseAnd(tokens);
            int zero = Math.min(lhs[0], lhs[1] + rhs[0]);
            int one = lhs[1] + rhs[1];
            return new int[]{zero, one};
        }
        return lhs;
    }

    public static int[] parseTerm(String[] tokens) {
        if (tokens[cur] == "?") {
            cur++;
            // debug(cur, 1);
            return new int[]{1, 1};
        } else if (tokens[cur] == "(") {
            cur++;
            // debug(cur, "or");
            int[] res = parseOr(tokens);
            if (tokens[cur] != ")") {
                throw new Exception("not closed");
            }
            cur++;
            // debug(cur);
            return res;
        }
        throw new Exception("Invalid token");
    }

    public static int[] parseOr(String[] tokens) {
        int[] lhs = parseAnd(tokens);
        if (tokens[cur] == "|") {
            cur++;
            int[] rhs = parseOr(tokens);
            int zero = lhs[0] + rhs[0];
            int one = Math.min(lhs[1], lhs[0] + rhs[1]);
            return new int[]{zero, one};
        }
        throw new Exception("Invalid token");
    }

    // debug function
    public static void debug(Object... args) {
        StringJoiner joiner = new StringJoiner(", ");
        for (Object arg : args) {
            joiner.add(arg.toString());
        }
        System.out.println(joiner.toString());
    }
}