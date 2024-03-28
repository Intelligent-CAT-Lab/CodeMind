import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.*;

public class p01783 {

    public static final int MOD = (int) (1e9 + 7);
    public static final double EPS = 1e-13;
    HashMap<String, Integer> fm = new HashMap<>();
    
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        System.out.println(main.solve());
    }
    
    public int solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine().trim();
        fm.put("", -1);
        int result = f(s);
        return result >= 0 ? result : "invalid".hashCode(); // 'invalid' as a return would cause a type mismatch, so returning hash.
    }
    
    public int f(String s) {
        if (fm.containsKey(s)) {
            return fm.get(s);
        }
        int l = s.length(), r = -1;
        if (l > 5 && (s.charAt(1) == '(' || s.charAt(1) == '?') && (s.charAt(l - 1) == ')' || s.charAt(l - 1) == '?')) {
            if (s.charAt(0) == 'R' || s.charAt(0) == '?') {
                for (int i = 3; i < l - 2; i++) {
                    if (s.charAt(i) != ',' && s.charAt(i) != '?') continue;
                    int tl = f(s.substring(2, i));
                    int tr = f(s.substring(i + 1, l - 1));
                    if (tl >= 0 && tr >= 0) r = Math.max(r, tr);
                }
            }
            if (s.charAt(0) == 'L' || s.charAt(0) == '?') {
                for (int i = 3; i < l - 2; i++) {
                    if (s.charAt(i) != ',' && s.charAt(i) != '?') continue;
                    int tl = f(s.substring(2, i));
                    int tr = f(s.substring(i + 1, l - 1));
                    if (tl >= 0 && tr >= 0) r = Math.max(r, tl);
                }
            }
        }
        boolean ff = true;
        if (s.charAt(0) == '0' && l > 1) ff = false;
        for (char tc : "RL,()".toCharArray()) {
            if (s.indexOf(tc) != -1) ff = false;
        }
        if (ff) {
            r = Integer.parseInt(s.replace('?', '9'));
        }
        fm.put(s, r);
        return r;
    }
}