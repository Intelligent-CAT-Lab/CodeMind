import java.util.Scanner;

public class p02100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int L = S.length();
        int cur = 0;
        int[] P = new int[6];
        while (cur < L) {
            char op = '+';
            while (true) {
                term(op);
                if (cur == L) {
                    break;
                }
                op = S.charAt(cur);
                cur++;
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
        for (int i = 0; i < R.length; i++) {
            if (R[i] != 0) {
                System.out.print("(x" + R[i] + ")");
            }
        }
    }

    public static void term(char op) {
        int cur = 0;
        int k = 1;
        if (S.charAt(cur) != 'x') {
            k = num();
        }
        int d = 0;
        if (cur < L && S.charAt(cur) == "x") {
            cur++;
            d = 1;
            if (cur < L && S.charAt(cur) == "^") {
                cur++;
                d = num();
            }
        }
        P[d] = k;
    }

    public static int num() {
        int cur = 0;
        int v = 0;
        while (cur < L && S.charAt(cur) in "0123456789") {
            v = 10 * v + int(S.charAt(cur));
            cur++;
        }
        return v;
    }

    public static int f(int[] P, int x) {
        int res = 0;
        for (int i = 0; i < 6; i++) {
            res += P[i] * (x ^ i);
        }
        return res;
    }
}