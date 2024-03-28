import java.util.*;

public class p02062 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] tokens = input.split(" ");
        // System.out.println(Arrays.toString(tokens));
        int len = tokens.length;
        int[] ans = parseFormula(tokens, len);
        System.out.println(ans[0] + " " + ans[1]);
    }

    public static int[] parseFormula(String[] tokens, int len) {
        int[] lhs = parseAnd(tokens, len);
        int[] rhs = parseOr(tokens, len);
        int zero = lhs[0] + rhs[0];
        int one = Math.min(lhs[1], lhs[0] + rhs[1]);
        return new int[]{zero, one};
    }

    public static int[] parseAnd(String[] tokens, int len) {
        int[] lhs = parseTerm(tokens, len);
        int[] rhs = parseAnd(tokens, len);
        int zero = Math.min(lhs[0], lhs[1] + rhs[0]);
        int one = lhs[1] + rhs[1];
        return new int[]{zero, one};
    }

    public static int[] parseOr(String[] tokens, int len) {
        int[] lhs = parseAnd(tokens, len);
        int[] rhs = parseOr(tokens, len);
        int zero = lhs[0] + rhs[0];
        int one = Math.min(lhs[1], lhs[0] + rhs[1]);
        return new int[]{zero, one};
    }

    public static int[] parseTerm(String[] tokens, int len) {
        if (tokens[len - 1].equals("?")) {
            return new int[]{1, 1};
        } else if (tokens[len - 1].equals("(")) {
            int[] res = parseOr(tokens, len);
            if (!tokens[len - 2].equals(")")) {
                throw new Exception("not closed");
            }
            return res;
        }
        return null;
    }
}