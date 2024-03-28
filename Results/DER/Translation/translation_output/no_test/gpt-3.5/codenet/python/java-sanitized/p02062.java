import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p02062 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] src = input.toCharArray();
        List<Character> tokens = new ArrayList<>();
        for (char ch : src) {
            if (ch != ' ') {
                tokens.add(ch);
            }
        }

        tokens.add('');  // "" as EOF
        int cur = 0;
        int[] result = parseFormula(tokens, cur);
        System.out.println(result[0] + " " + result[1]);
    }

    public static int[] parseFormula(List<Character> tokens, int cur) {
        return parseOr(tokens, cur);
    }

    public static int[] parseOr(List<Character> tokens, int cur) {
        int[] lhs = parseAnd(tokens, cur);
        if (tokens.get(cur) == '|') {
            cur++;
            int[] rhs = parseOr(tokens, cur);
            int zero = lhs[0] + rhs[0];
            int one = Math.min(lhs[1], lhs[0] + rhs[1]);
            return new int[]{zero, one};
        }
        return lhs;
    }

    public static int[] parseAnd(List<Character> tokens, int cur) {
        int[] lhs = parseTerm(tokens, cur);
        if (tokens.get(cur) == '&') {
            cur++;
            int[] rhs = parseAnd(tokens, cur);
            int zero = Math.min(lhs[0], lhs[1] + rhs[0]);
            int one = lhs[1] + rhs[1];
            return new int[]{zero, one};
        }
        return lhs;
    }

    public static int[] parseTerm(List<Character> tokens, int cur) {
        if (tokens.get(cur) == '?') {
            cur++;
            return new int[]{1, 1};
        } else if (tokens.get(cur) == '(') {
            cur++;
            int[] res = parseOr(tokens, cur);
            if (tokens.get(cur) != ')') {
                throw new RuntimeException("not closed");
            }
            cur++;
            return res;
        }
        return new int[]{0, 0};  // default case, handles other characters than '?' and '('
    }
}