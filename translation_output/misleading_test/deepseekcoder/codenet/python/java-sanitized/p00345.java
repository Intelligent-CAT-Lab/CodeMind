import java.util.Scanner;

public class p00345 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        String all = "";
        String sub = "";
        int p = -1;
        int o = -1;
        int l = 0;

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '.') {
                o = i;
            } else if (S.charAt(i) == '(') {
                p = i;
                sub = all;
                l = o;
            } else if (S.charAt(i) != ')') {
                all += S.charAt(i);
            }
        }

        int d = S.length() - o - 1;
        if (p == -1) {
            printV(Integer.parseInt(all), (int) Math.pow(10, d));
        } else {
            d -= 2;
            printV(Integer.parseInt(all) - Integer.parseInt(sub), (int) Math.pow(10, d) - (int) Math.pow(10, l));
        }
    }

    public static int gcd(int x, int y) {
        return y == 0 ? x : gcd(y, x % y);
    }

    public static void printV(int x, int y) {
        int g = gcd(x, y);
        System.out.println((x / g) + "/" + (y / g));
    }
}