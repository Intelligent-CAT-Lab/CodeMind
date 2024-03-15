public class p00345 {
    public static int gcd(int x, int y) {
        return gcd(y, x % y) == 0 ? x : gcd(y, x % y);
    }

    public static void printV(int x, int y) {
        int g = gcd(x, y);
        System.out.println(x / g + "/" + y / g);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String all = "";
        String sub = "";
        int p = -1;

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '.') {
                int o = i;
            } else if (S.charAt(i) == '(') {
                p = i;
                sub = all;
            } else {
                all += S.charAt(i);
            }
        }

        int d = S.length() - o - 1;
        int l = p - o - 1;
        if (p == -1) {
            printV(Integer.parseInt(all), 10 ** d);
        } else {
            d -= 2; // for ()
            printV(Integer.parseInt(all) - Integer.parseInt(sub), 10 ** d - 10 ** l);
        }
    }
}