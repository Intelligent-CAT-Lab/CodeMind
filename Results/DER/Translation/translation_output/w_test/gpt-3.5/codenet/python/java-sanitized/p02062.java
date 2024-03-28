import java.util.*;

public class p02062 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Character> src = new ArrayList<>();
        for (char c : input.toCharArray()) {
            src.add(c);
        }

        List<Character> tokens = new ArrayList<>();
        for (char tok : src) {
            if (tok != ' ') {
                tokens.add(tok);
            }
        }
        tokens.add(' ');

        int cur = 0;

        int[] result = parseFormula(tokens);

        System.out.println(result[0] + " " + result[1]);
    }

    static int[] parseFormula(List<Character> tokens) {
        int[] result = parseOr(tokens);

        return new int[]{result[0], result[1]};
    }

    static int[] parseOr(List<Character> tokens) {
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

    static int[] parseAnd(List<Character> tokens) {
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

    static int[] parseTerm(List<Character> tokens) {
        if (tokens.get(cur) == '?') {
            cur++;
            return new int[]{1, 1};
        } else {
            System.out.println("Error: Invalid token encountered");
            System.exit(1);
            return null;
        }
    }
}