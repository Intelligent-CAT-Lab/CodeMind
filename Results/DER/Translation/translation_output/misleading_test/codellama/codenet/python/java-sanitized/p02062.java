import java.util.ArrayList;
import java.util.List;

public class p02062 {
    public static void main(String[] args) {
        String input = "?&?|?&?|?&?";
        List<String> tokens = new ArrayList<>();
        for (char c : input.toCharArray()) {
            if (c != ' ') {
                tokens.add(String.valueOf(c));
            }
        }
        tokens.add(""); // add EOF

        int cur = 0;
        int[] ans = parseFormula(tokens, cur);
        System.out.println(ans[0] + " " + ans[1]);
    }

    private static int[] parseFormula(List<String> tokens, int cur) {
        int[] lhs = parseOr(tokens, cur);
        if (tokens.get(cur).equals("|")) {
            cur++;
            int[] rhs = parseFormula(tokens, cur);
            int zero = lhs[0] + rhs[0];
            int one = Math.min(lhs[1], lhs[0] + rhs[1]);
            return new int[] { zero, one };
        }
        return lhs;
    }

    private static int[] parseOr(List<String> tokens, int cur) {
        int[] lhs = parseAnd(tokens, cur);
        if (tokens.get(cur).equals("|")) {
            cur++;
            int[] rhs = parseOr(tokens, cur);
            int zero = Math.min(lhs[0], lhs[1] + rhs[0]);
            int one = lhs[1] + rhs[1];
            return new int[] { zero, one };
        }
        return lhs;
    }

    private static int[] parseAnd(List<String> tokens, int cur) {
        int[] lhs = parseTerm(tokens, cur);
        if (tokens.get(cur).equals("&")) {
            cur++;
            int[] rhs = parseAnd(tokens, cur);
            int zero = Math.min(lhs[0], lhs[1] + rhs[0]);
            int one = lhs[1] + rhs[1];
            return new int[] { zero, one };
        }
        return lhs;
    }

    private static int[] parseTerm(List<String> tokens, int cur) {
        if (tokens.get(cur).equals("?")) {
            cur++;
            return new int[] { 1, 1 };
        } else if (tokens.get(cur).equals("(")) {
            cur++;
            int[] res = parseOr(tokens, cur);
            if (!tokens.get(cur).equals(")")) {
                throw new RuntimeException("not closed");
            }
            cur++;
            return res;
        }
        return new int[] { 0, 0 };
    }
}