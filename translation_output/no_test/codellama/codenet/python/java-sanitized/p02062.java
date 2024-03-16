import java.util.ArrayList;
import java.util.List;

public class p02062 {
    private List<String> tokens;
    private int cur;

    public FormulaParser(List<String> tokens) {
        this.tokens = tokens;
        this.cur = 0;
    }

    public int[] parseFormula() {
        return parseOr();
    }

    private int[] parseOr() {
        int[] lhs = parseAnd();
        if (tokens.get(cur).equals("|")) {
            cur++;
            int[] rhs = parseOr();
            int zero = lhs[0] + rhs[0];
            int one = Math.min(lhs[1], lhs[0] + rhs[1]);
            return new int[] { zero, one };
        }
        return lhs;
    }

    private int[] parseAnd() {
        int[] lhs = parseTerm();
        if (tokens.get(cur).equals("&")) {
            cur++;
            int[] rhs = parseAnd();
            int zero = Math.min(lhs[0], lhs[1] + rhs[0]);
            int one = lhs[1] + rhs[1];
            return new int[] { zero, one };
        }
        return lhs;
    }

    private int[] parseTerm() {
        if (tokens.get(cur).equals("?")) {
            cur++;
            return new int[] { 1, 1 };
        } else if (tokens.get(cur).equals("(")) {
            cur++;
            int[] res = parseOr();
            if (!tokens.get(cur).equals(")")) {
                throw new IllegalArgumentException("not closed");
            }
            cur++;
            return res;
        }
        return new int[] { 0, 0 };
    }

    public static void main(String[] args) {
        List<String> tokens = new ArrayList<>();
        tokens.add("?");
        tokens.add("|");
        tokens.add("(");
        tokens.add("?");
        tokens.add("&");
        tokens.add("?");
        tokens.add(")");
        tokens.add("|");
        tokens.add("?");

        FormulaParser parser = new FormulaParser(tokens);
        int[] ans = parser.parseFormula();
        System.out.println(ans[0] + " " + ans[1]);
    }
}