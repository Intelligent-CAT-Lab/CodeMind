import java.util.*;
import java.lang.*;

class Main {
    static Map<String, Integer> fm = new HashMap<>();

    static int f(String s) {
        if (fm.containsKey(s)) {
            return fm.get(s);
        }
        int l = s.length();
        int r = -1;
        if (l > 5 && (s.charAt(1) == '(' || s.charAt(1) == '?') && (s.charAt(l - 1) == ')' || s.charAt(l - 1) == '?')) {
            if (s.charAt(0) == 'R' || s.charAt(0) == '?') {
                for (int i = 3; i < l - 2; i++) {
                    if (s.charAt(i) != ',' && s.charAt(i) != '?') {
                        continue;
                    }
                    int tl = f(s.substring(2, i));
                    int tr = f(s.substring(i + 1, l - 1));
                    if (tl >= 0 && tr >= 0 && r < tr) {
                        r = tr;
                    }
                }
            }
            if (s.charAt(0) == 'L' || s.charAt(0) == '?') {
                for (int i = 3; i < l - 2; i++) {
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
        if (s.charAt(0) == '0' && l > 1) {
            ff = false;
        }
        for (char tc : "RL,".toCharArray()) {
            if (s.indexOf(tc) != -1) {
                ff = false;
                break;
            }
        }
        if (ff) {
            r = Integer.parseInt(s.replace("?", "9"));
        }
        fm.put(s, r);
        return r;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int r = f(s);
        if (r < 0) {
            System.out.println("invalid");
        } else {
            System.out.println(r);
        }
    }
}