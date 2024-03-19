import java.util.*;

public class p01783 {
    static int inf = (int) 1e18;
    static double eps = 1e-13;
    static int mod = (int) 1e9 + 7;
    static int[] dd = {{1, 0}, {0, 1}, {1, 0}, {0, -1}};
    static int[] ddn = {{1, 0}, {1, 1}, {0, 1}, {1, 1}, {1, 0}, {1, -1}, {0, -1}, {-1, -1}};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sysLimit = (int) (1e7);
        List<Integer> fm = new ArrayList<>();
        fm.add(-1, "");

        public static int f(String s) {
            if (s.equals("")) {
                return -1;
            }
            int l = s.length();
            int r = -1;
            if (l > 5 && s.charAt(1) == '(' && s.charAt(l - 1) == ')') {
                if (s.charAt(0) == 'R') {
                    for (int i = 2; i < l - 1; i++) {
                        if (s.charAt(i) != ',' && s.charAt(i) != '?') {
                            continue;
                        }
                        int tl = f(s.substring(2, i));
                        int tr = f(s.substring(i + 1, l - 1));
                        if (tl >= 0 && tr >= 0 && r < tr) {
                            r = tr;
                        }
                    }
                } else if (s.charAt(0) == 'L') {
                    for (int i = 2; i < l - 1; i++) {
                        if (s.charAt(i) != ',' && s.charAt(i) != '?') {
                            continue;
                        }
                        int tl = f(s.substring(2, i));
                        int tr = f(s.substring(i + 1, l - 1));
                        if (tl >= 0 && tr >= 0 && r < tl) {
                            r = tl;
                        }
                    }
                }
            }
            boolean ff = true;
            for (char tc : new char[]{'0', 'R', 'L', '(', ')', ','}) {
                if (s.indexOf(tc) != -1) {
                    ff = false;
                    break;
                }
            }
            if (ff) {
                r = Integer.parseInt(s.replace('?', '9'));
            }
            fm.add(s, r);
            return r;
        }

        int r = f(sc.nextLine());
        if (r < 0) {
            System.out.println("invalid");
        } else {
            System.out.println(r);
        }
    }
}