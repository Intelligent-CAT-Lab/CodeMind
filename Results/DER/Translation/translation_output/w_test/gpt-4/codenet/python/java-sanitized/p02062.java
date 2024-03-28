import java.util.Scanner;

public class p02062 {
    private static String[] tokens;
    private static int cur = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        tokens = input.replaceAll(" ", "").split("");
        parseFormula();
        scanner.close();
    }

    private static void parseFormula() {
        int[] result = parseOr();
        System.out.println(result[0] + " " + result[1]);
    }

    private static int[] parseOr() {
        int[] lhs = parseAnd();
        if (cur < tokens.length && tokens[cur].equals("|")) {
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
        if (cur < tokens.length && tokens[cur].equals("&")) {
            cur++;
            int[] rhs = parseAnd();
            int zero = Math.min(lhs[0], lhs[1] + rhs[0]);
            int one = lhs[1] + rhs[1];
            return new int[]{zero, one};
        }
        return lhs;
    }

    private static int[] parseTerm() {
        if (cur < tokens.length && tokens[cur].equals("?")) {
            cur++;
            return new int[]{1, 1};
        } else if (cur < tokens.length && tokens[cur].equals("(")) {
            cur++;
            int[] res = parseOr();
            if (cur >= tokens.length || !tokens[cur].equals(")")) {
                throw new RuntimeException("Not closed");
            }
            cur++;
            return res;
        }
        throw new RuntimeException("Unexpected token: " + tokens[cur]);
    }
}