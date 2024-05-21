import java.util.Scanner;

public class p02062 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] tokens = input.replaceAll(" ", "").split("");
        int[] ans = parseFormula(tokens, 0);
        System.out.println(ans[0] + " " + ans[1]);
    }

    public static int[] parseFormula(String[] tokens, int cur) {
        return parseOr(tokens, cur);
    }

    public static int[] parseOr(String[] tokens, int cur) {
        int[] lhs = parseAnd(tokens, cur);
        if (cur < tokens.length && tokens[cur].equals("|")) {
            cur++;
            int[] rhs = parseOr(tokens, cur);
            int zero = lhs[0] + rhs[0];
            int one = Math.min(lhs[1], lhs[0] + rhs[1]);
            return new int[]{zero, one};
        }
        return lhs;
    }

    public static int[] parseAnd(String[] tokens, int cur) {
        int[] lhs = parseTerm(tokens, cur);
        if (cur < tokens.length && tokens[cur].equals("&")) {
            cur++;
            int[] rhs = parseAnd(tokens, cur);
            int zero = Math.min(lhs[0], lhs[1] + rhs[0]);
            int one = lhs[1] + rhs[1];
            return new int[]{zero, one};
        }
        return lhs;
    }

    public static int[] parseTerm(String[] tokens, int cur) {
        if (cur < tokens.length && tokens[cur].equals("?")) {
            cur++;
            return new int[]{1, 1};
        } else if (cur < tokens.length && tokens[cur].equals("(")) {
            cur++;
            int[] res = parseOr(tokens, cur);
            if (cur