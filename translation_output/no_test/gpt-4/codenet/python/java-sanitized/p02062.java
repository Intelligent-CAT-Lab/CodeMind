import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p02062 {
    private static List<String> tokens;
    private static int cur;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        tokens = new ArrayList<>();
        for (char token : inputLine.toCharArray()) {
            if (token != ' ') {
                tokens.add(String.valueOf(token));
            }
        }
        tokens.add(""); // EOF
        cur = 0;

        int[] ans = parseFormula();
        System.out.println(ans[0] + " " + ans[1]);
        
        scanner.close();
    }

    private static int[] parseFormula() {
        return parseOr();
    }

    private static int[] parseOr() {
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

    private static int[] parseAnd() {
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

    private static int[] parseTerm() {
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
        throw new RuntimeException("Unexpected token");
    }
}