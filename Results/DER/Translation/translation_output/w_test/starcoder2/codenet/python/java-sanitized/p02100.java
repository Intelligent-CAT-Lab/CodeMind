import java.util.Scanner;

public class p02100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] p = new int[6];
        int cur = 0;
        int l = s.length();
        while (cur < l) {
            char op = '+';
            while (true) {
                term(op, p, s, cur);
                if (cur == l) {
                    break;
                }
                op = s.charAt(cur);
                cur++;
            }
        }
        int d = 5;
        while (p[d] == 0) {
            d--;
        }
        int[] r = new int[2000];
        for (int x = 2000; x >= -2000; x--) {
            if (f(p, x) == 0) {
                r[x + 2000] = x;
            }
        }
        for (int i = 0; i < r.length; i++) {
            if (r[i] != 0) {
                System.out.print("(x" + r[i] + ")");
            }
        }
    }

    public static void term(char op, int[] p, String s, int cur) {
        int k = 1;
        if (s.charAt(cur) != 'x') {
            k = num(s, cur);
        }
        int d = 0;
        if (cur < s.length() && s.charAt(cur) == 'x') {
            cur++;
            d = 1;
            if (cur < s.length() && s.charAt(cur) == '^') {
                cur++;
                d = num(s, cur);
            }
        }
        p[d] = op == '+' ? k : -k;
    }

    public static int num(String s, int cur) {
        int v = 0;
        while (cur < s.length() && s.charAt(cur) >= '0' && s.charAt(cur) <= '9') {
            v = 10 * v + (s.charAt(cur) - '0');
            cur++;
        }
        return v;
    }

    public static int f(int[] p, int x) {
        int res = 0;
        for (int i = 0; i < 6; i++) {
            res += p[i] * (int) Math.pow(x, i);
        }
        return res;
    }
}