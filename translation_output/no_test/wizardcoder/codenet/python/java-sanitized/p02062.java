import java.util.*;

public class p02062 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        List<String> tokens = new ArrayList<String>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c!='') {
                tokens.add(Character.toString(c));
            }
        }
        tokens.add(""); // EOF
        int cur = 0;
        int[] ans = parse_formula(tokens, cur);
        System.out.println(ans[0] + " " + ans[1]);
    }

    public static int[] parse_formula(List<String> tokens, int cur) {
        return parse_or(tokens, cur);
    }

    public static int[] parse_or(List<String> tokens, int cur) {
        int[] lhs = parse_and(tokens, cur);
        if (tokens.get(cur).equals("|")) {
            cur++;
            int[] rhs = parse_or(tokens, cur);
            int zero = lhs[0] + rhs[0];
            int one = Math.min(lhs[1], lhs[0] + rhs[1]);
            return new int[]{zero, one};
        }
        return lhs;
    }

    public static int[] parse_and(List<String> tokens, int cur) {
        int[] lhs = parse_term(tokens, cur);
        if (tokens.get(cur).equals("&")) {
            cur++;
            int[] rhs = parse_and(tokens, cur);
            int zero = Math.min(lhs[0], lhs[1] + rhs[0]);
            int one = lhs[1] + rhs[1];
            return new int[]{zero, one};
        }
        return lhs;
    }

    public static int[] parse_term(List<String> tokens, int cur) {
        if (tokens.get(cur).equals("?")) {
            cur++;
            return new int[]{1, 1};
        } else if (tokens.get(cur).equals("(")) {
            cur++;
            int[] res = parse_or(tokens, cur);
            if (!tokens.get(cur).equals(")")) {
                throw new Exception("not closed");
            }
            cur++;
            return res;
        }
        throw new Exception("unknown token");
    }
}