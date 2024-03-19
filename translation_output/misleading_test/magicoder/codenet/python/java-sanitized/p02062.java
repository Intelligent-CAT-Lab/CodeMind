import java.util.*;

public class p02062 {
    static List<String> tokens = new ArrayList<>();
    static int cur = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        for (char c : input.toCharArray()) {
            if (c != ' ') {
                tokens.add(String.valueOf(c));
            }
        }
        tokens.add("");
        int[] ans = parseFormula();
        System.out.println(ans[0] + " " + ans[1]);
    }

    static int[] parseFormula() {
        return parseOr();
    }

    static int[] parseOr() {
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

    static int[] parseAnd() {
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

    static int[] parseTerm() {
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
        throw new RuntimeException("unexpected token");
    }
}