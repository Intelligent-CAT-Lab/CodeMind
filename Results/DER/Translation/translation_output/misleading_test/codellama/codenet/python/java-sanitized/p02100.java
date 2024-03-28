import java.util.Scanner;

public class p02100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int length = input.length();

        int cur = 0;
        int[] P = new int[6];

        while (cur < length) {
            char op = input.charAt(cur);
            cur++;
            if (op == '+') {
                term(op, P);
            } else if (op == '-') {
                term(op, P);
            }
        }

        int d = 5;
        while (P[d] == 0) {
            d--;
        }

        int[] R = new int[2000];
        for (int x = 2000; x >= -2001; x--) {
            if (f(P, x) == 0) {
                R[x] = x;
            }
        }

        for (int x : R) {
            System.out.print("(x" + x + ")");
        }
    }

    public static void term(char op, int[] P) {
        int k = 1;
        if (op == '+') {
            k = num(P);
        } else if (op == '-') {
            k = -num(P);
        }
        int d = 0;
        if (P[cur] == 'x') {
            cur++;
            d = 1;
            if (P[cur] == '^') {
                cur++;
                d = num(P);
            }
        }
        P[d] = k;
    }

    public static int num(int[] P) {
        int v = 0;
        while (cur < length && P[cur] in "0123456789") {
            v = 10 * v + Integer.parseInt(P[cur]);
            cur++;
        }
        return v;
    }

    public static int f(int[] P, int x) {
        int res = 0;
        for (int i = 0; i < 6; i++) {
            res += P[i] * (x ** i);
        }
        return res;
    }
}