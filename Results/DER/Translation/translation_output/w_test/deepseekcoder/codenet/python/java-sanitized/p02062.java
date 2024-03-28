import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p02062 {
    static List<String> tokens = new ArrayList<>();
    static int cur = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        for (char c : input.toCharArray()) {
            if (c != ' ') {
                tokens.add(String.valueOf(c));
            }
        }
        tokens.add("");
        Pair ans = parseFormula();
        System.out.println(ans.zero + " " + ans.one);
    }

    static Pair parseFormula() {
        return parseOr();
    }

    static Pair parseOr() {
        Pair lhs = parseAnd();
        if (tokens.get(cur).equals("|")) {
            cur += 1;
            Pair rhs = parseOr();
            int zero = lhs.zero + rhs.zero;
            int one = Math.min(lhs.one, lhs.zero + rhs.one);
            return new Pair(zero, one);
        }
        return lhs;
    }

    static Pair parseAnd() {
        Pair lhs = parseTerm();
        if (tokens.get(cur).equals("&")) {
            cur += 1;
            Pair rhs = parseAnd();
            int zero = Math.min(lhs.zero, lhs.one + rhs.zero);
            int one = lhs.one + rhs.one;
            return new Pair(zero, one);
        }
        return lhs;
    }

    static Pair parseTerm() {
        if (tokens.get(cur).equals("?")) {
            cur += 1;
            return new Pair(1, 1);
        } else if (tokens.get(cur).equals("(")) {
            cur += 1;
            Pair res = parseOr();
            if (!tokens.get(cur).equals(")")) {
                throw new RuntimeException("not closed");
            }
            cur += 1;
            return res;
        }
        throw new RuntimeException("unexpected token: " + tokens.get(cur));
    }

    static class Pair {
        int zero, one;

        Pair(int zero, int one) {
            this.zero = zero;
            this.one = one;
        }
    }
}