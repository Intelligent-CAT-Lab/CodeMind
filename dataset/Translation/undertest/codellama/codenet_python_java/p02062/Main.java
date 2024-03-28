import java.util.ArrayList;
import java.util.List;

public class p02062 {
    public static void main(String[] args) {
        String input = "?&?|?&?|?&?";
        List<String> tokens = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' ') {
                tokens.add(String.valueOf(input.charAt(i)));
            }
        }
        tokens.add(""); // "" as EOF
        int cur = 0;
        int[] parseFormula = parseOr();
        System.out.println(parseFormula[0] + " " + parseFormula[1]);
    }

    private static int[] parseOr() {
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

    private static int[] parseAnd() {
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

    private static int[] parseTerm() {
        if (tokens.get(cur).equals("?")) {
            cur++;
            return new int[] { 1, 1 };
        } else if (tokens.get(cur).equals("(")) {
            cur++;
            int[] res = parseOr();
            if (!tokens.get(cur).equals(")")) {
                throw new RuntimeException("not closed");
            }
            cur++;
            return res;
        }
        return new int[] { 0, 0 };
    }
}