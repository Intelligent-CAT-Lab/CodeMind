public class p00345 {
    public static void main(String[] args) {
        String S = "0.(3)";
        String all = "";
        String sub = "";
        int p = -1;
        int d = 0;
        int l = 0;

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '.') {
                d = i;
            } else if (S.charAt(i) == '(') {
                p = i;
                sub = all;
            } else if (S.charAt(i)!= ')') {
                all += S.charAt(i);
            }
        }

        if (p == -1) {
            printV(Integer.parseInt(all), (int) Math.pow(10, d));
        } else {
            d -= 2; // for ()
            printV(Integer.parseInt(all) - Integer.parseInt(sub), (int) Math.pow(10, d) - (int) Math.pow(10, l));
        }
    }

    public static int gcd(int x, int y) {
        return y == 0? x : gcd(y, x % y);
    }

    public static void printV(int x, int y) {
        int g = gcd(x, y);
        System.out.println(x / g + "/" + y / g);
    }
}