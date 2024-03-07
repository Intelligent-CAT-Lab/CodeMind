import java.util.Scanner;

public class p01783 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int l = s.length();
        int[] fm = new int[l];
        fm[0] = -1;
        int r = -1;
        if (l > 5 && s.charAt(1) == '(' && s.charAt(l-1) == ')') {
            if (s.charAt(0) == 'R') {
                for (int i = 3; i < l-2; i++) {
                    if (s.charAt(i) != ',' && s.charAt(i) != '?') {
                        continue;
                    }
                    int tl = fm[s.substring(2, i)];
                    int tr = fm[s.substring(i+1, l-1)];
                    if (tl >= 0 && tr >= 0 && r < tr) {
                        r = tr;
                    }
                }
            }
            if (s.charAt(0) == 'L') {
                for (int i = 3; i < l-2; i++) {
                    if (s.charAt(i) != ',' && s.charAt(i) != '?') {
                        continue;
                    }
                    int tl = fm[s.substring(2, i)];
                    int tr = fm[s.substring(i+1, l-1)];
                    if (tl >= 0 && tr >= 0 && r < tl) {
                        r = tl;
                    }
                }
            }
        }
        boolean ff = true;
        if (s.charAt(0) == '0' && l > 1) {
            ff = false;
        }
        for (char tc : "RL,()".toCharArray()) {
            if (s.contains(tc)) {
                ff = false;
                break;
            }
        }
        if (ff) {
            r = Integer.parseInt(s.replace("?", "9"));
        }
        fm[s] = r;
        return r;
    }
}