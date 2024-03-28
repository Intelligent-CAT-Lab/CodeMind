import java.util.Scanner;

public class p00345 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int o = S.indexOf('.');
        int p = S.indexOf('(');
        int d = S.length() - o - 1;
        int l = p - o - 1;
        String all = "";
        String sub = "";
        if (p == -1) {
            int x = Integer.parseInt(S.substring(0, o));
            int y = (int) Math.pow(10, d);
            printV(x, y);
        } else {
            all = S.substring(0, o);
            sub = S.substring(p, S.length());
            d -= 2; // for ()
            int x = Integer.parseInt(all) - Integer.parseInt(sub);
            int y = (int) Math.pow(10, d) - (int) Math.pow(10, l);
            printV(x, y);
        }
    }

    public static void printV(int x, int y) {
        int g = gcd(x, y);
        System.out.println("^" + x/g + "/" + y/g);
    }

    public static int gcd(int x, int y) {
        return y == 0? x : gcd(y, x % y);
    }
}