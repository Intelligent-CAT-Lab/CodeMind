import java.util.*;

public class p01783 {
    public static void main(String[] args) {
        System.out.println(main());
    }

    public static String main() {
        String s = System.console().readLine();
        int l = s.length();
        Map<String, Integer> fm = new HashMap<>();
        fm.put("", -1);
        int f(String s) {
            if (fm.containsKey(s)) {
                return fm.get(s);
            }
            int r = -1;
            if (l > 5 && s.charAt(1) == '?' && s.charAt(l - 1) == '?') {
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