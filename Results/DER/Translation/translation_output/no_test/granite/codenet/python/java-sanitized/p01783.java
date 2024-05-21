import java.io.*;
import java.util.*;

class Main {
    static String s;
    static int l;
    static HashMap<String, Integer> fm;

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        s = in.readLine();
        l = s.length();
        fm = new HashMap<>();
        fm.put("", -1);
        out.println(f(s));
        in.close();
        out.close();
    }

    static int f(String s) {
        if (fm.containsKey(s)) {
            return fm.get(s);
        }
        int r = -1;
        if (l > 5 && s.charAt(1) == '(' && s.charAt(l - 1) == ')') {
            if (s.charAt(0) == 'R' || s.charAt(0) == '?') {
                for (int i = 3; i < l - 2; i++) {
                    if (s.charAt(i)!= ',' && s.charAt(i)!= '?') {
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
                    if (s.charAt(i)!= ',' && s.charAt(i)!= '?') {
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
        for (char tc : "RL,()".toCharArray()) {
            if (s.indexOf(tc)!= -1) {
                ff = false;
                break;
            }
        }
        if (ff) {
            r = Integer.parseInt(s.replaceAll("\\\\?", "9"));
        }
        fm.put(s, r);
        return r;
    }
}