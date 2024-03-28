import java.util.*;

public class p01783 {
    static int inf = (int) 1e18;
    static double eps = 1e-13;
    static int mod = (int) 1e9 + 7;
    static int[] dd = {{1, 0}, {0, 1}, {1, 0}, {0, -1}};
    static int[] ddn = {{1, 0}, {1, 1}, {0, 1}, {1, 1}, {1, 0}, {1, -1}, {0, -1}, {-1, -1}};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.setRecursionLimit(1000000);

        int[] s = new int[sc.nextLine().split("\\s+").length];
        int n = s.length;
        Map<String, Integer> fm = new HashMap<>();
        fm.put("", -1);

        int r = f(s);
        if (r < 0) {
            System.out.println("invalid");
        } else {
            System.out.println(r);
        }
    }

    public static int f(int[] s) {
        if (s[0] == '0' && s.length > 1) {
            return s[1];
        }
        int l = s.length;
        int r = -1;
        if (l > 5 && (s[1] == '(' || s[1] == '?')) && (s[l - 1] == ')' || s[l - 1] == '?')) {
            if (s[0] == 'R') {
                for (int i = 1; i < l - 1; i++) {
                    if (s[i] != ',' && s[i] != '?' && s[i] != '(' && s[i] != ')') {
                        continue;
                    }
                    int tl = f(Arrays.copyOfRange(s, 2, i));
                    int tr = f(Arrays.copyOfRange(s, i + 1, l - 1));
                    if (tl >= 0 && tr >= 0 && r < tr) {
                        r = tr;
                    }
                }
            } else if (s[0] == 'L') {
                for (int i = 1; i < l - 1; i++) {
                    if (s[i] != ',' && s[i] != '?' && s[i] != '(' && s[i] != ')') {
                        continue;
                    }
                    int tl = f(Arrays.copyOfRange(s, 2, i));
                    int tr = f(Arrays.copyOfRange(s, i + 1, l - 1));
                    if (tl >= 0 && tr >= 0 && r < tl) {
                        r = tl;
                    }
                }
            }
        }
        boolean ff = true;
        for (String tc : new String[]{"RL", "()"}) {
            if (tc.equals("")) {
                continue;
            }
            for (int i = 0; i < s.length; i++) {
                if (s[i] == tc.charAt(0)) {
                    ff = false;
                    break;
                }
            }
            if (ff) {
                int t = s[0];
                for (int i = 1; i < s.length; i++) {
                    if (s[i] == '?') {
                        s[i] = '9';
                    }
                }
                r = f(s);
                fm.put(String.valueOf(s), r);
                return r;
            }
        }
        int tl = f(Arrays.copyOfRange(s, 2, s.length - 1));
        int tr = f(Arrays.copyOfRange(s, 0, 1));
        if (tl >= 0 && tr >= 0 && r < tr) {
            r = tr;
        }
        fm.put(String.valueOf(s), r);
        return r;
    }
}