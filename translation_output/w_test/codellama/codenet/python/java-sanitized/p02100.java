import java.util.Scanner;

public class p02100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int length = input.length();

        int cur = 0;
        int[] P = new int[6];

        expr(input, length, cur, P);

        int d = 5;
        while (P[d] == 0) {
            d--;
        }

        List<Integer> R = new ArrayList<>();
        for (int x = 2000; x >= -2001; x--) {
            if (f(P, x) == 0) {
                R.add(x);
            }
        }

        System.out.println(R.stream().map(x -> "(x" + (x < 0 ? "-" : "+") + Math.abs(x) + ")").collect(Collectors.joining()));
    }

    private static void expr(String input, int length, int cur, int[] P) {
        String op = "+";
        while (cur < length) {
            term(input, length, cur, P, op);
            if (cur == length) {
                break;
            }
            op = input.substring(cur, cur + 1);
            cur++; // "+"/"-"
        }
    }

    private static int num(String input, int cur) {
        int v = 0;
        while (cur < length && input.charAt(cur) in "0123456789") {
            v = 10 * v + Integer.parseInt(input.substring(cur, cur + 1));
            cur++;
        }
        return v;
    }

    private static void term(String input, int length, int cur, int[] P, String op) {
        int k = 1;
        if (input.charAt(cur) != 'x') {
            k = num(input, cur);
        }
        int d = 0;
        if (cur < length && input.charAt(cur) == "x") {
            cur++; // "x"
            d = 1;
            if (cur < length && input.charAt(cur) == '^') {
                cur++; // "^"
                d = num(input, cur);
            }
        }
        P[d] = k if op == '+' else -k;
    }

    private static int f(int[] P, int x) {
        int res = 0;
        for (int i = 0; i < 6; i++) {
            res += P[i] * (int) Math.pow(x, i);
        }
        return res;
    }
}