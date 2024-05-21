import java.util.*;

public class p02062 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] src = input.toCharArray();
        List<Character> tokens = new ArrayList<>();
        for (char c : src) {
            if (c!='') {
                tokens.add(c);
            }
        }
        tokens.add(' ');

        int cur = 0;
        int[] ans = parseFormula(tokens);
        System.out.println(ans[0] + " " + ans[1]);
    }

    public static int[] parseFormula(List<Character> tokens) {
        int[] res = parseOr(tokens);
        if (tokens.get(cur)!= ')') {
            throw new RuntimeException("not closed");
        }
        cur++;
        return res;
    }

    public static int[] parseOr(List<Character> tokens) {
        int[] lhs = parseAnd(tokens);
        if (tokens.get(cur) == '|') {
            cur++;
            int[] rhs = parseOr(tokens);
            int zero = lhs[0] + rhs[0];
            int one = Math.min(lhs[1], lhs[0] + rhs[1]);
            return new int[]{zero, one};
        }
        return lhs;
    }

    public static int[] parseAnd(List<Character> tokens) {
        int[] lhs = parseTerm(tokens);
        if (tokens.get(cur) == '&') {
            cur++;
            int[] rhs = parseAnd(tokens);
            int zero = Math.min(lhs[0], lhs[1] + rhs[0]);
            int one = lhs[1] + rhs[1];
            return new int[]{zero, one};
        }
        return lhs;
    }

    public static int[] parseTerm(List<Character> tokens) {
        if (tokens.get(cur) == '?') {
            cur++;
            return new int[]{1, 1};
        } else if (tokens.get(cur) == '(') {
            cur++;
            int[] res = parseOr(tokens);
            return res;
        }
        throw new RuntimeException("invalid token");
    }
}