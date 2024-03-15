import java.util.ArrayList;
import java.util.List;

public class p02062 {
    private List<String> tokens;
    private int cur;

    public static void main(String[] args) {
        String input = "2 + 3 & 4 | 5";
        FormulaParser parser = new FormulaParser(input);
        List<Integer> result = parser.parseFormula();
        System.out.println(result.get(0) + " " + result.get(1));
    }

    public FormulaParser(String input) {
        this.tokens = new ArrayList<>(input.split("\\s+"));
        this.cur = 0;
    }

    public List<Integer> parseFormula() {
        return parseOr();
    }

    private List<Integer> parseOr() {
        List<Integer> lhs = parseAnd();
        if (tokens.get(cur).equals("|")) {
            cur++;
            List<Integer> rhs = parseOr();
            int zero = lhs.get(0) + rhs.get(0);
            int one = Math.min(lhs.get(1), lhs.get(0) + rhs.get(1));
            return List.of(zero, one);
        }
        return lhs;
    }

    private List<Integer> parseAnd() {
        List<Integer> lhs = parseTerm();
        if (tokens.get(cur).equals("&")) {
            cur++;
            List<Integer> rhs = parseAnd();
            int zero = Math.min(lhs.get(0), lhs.get(1) + rhs.get(0));
            int one = lhs.get(1) + rhs.get(1);
            return List.of(zero, one);
        }
        return lhs;
    }

    private List<Integer> parseTerm() {
        if (tokens.get(cur).equals("?")) {
            cur++;
            // debug(cur, 1)
            return List.of(1, 1);
        } else if (tokens.get(cur).equals("(")) {
            cur++;
            // debug(cur, "or")
            List<Integer> res = parseOr();
            if (!tokens.get(cur).equals(")")) {
                throw new Exception("not closed");
            }
            cur++;
            // debug(cur)
            return res;
        }
        throw new Exception("Invalid token: " + tokens.get(cur));
    }
}