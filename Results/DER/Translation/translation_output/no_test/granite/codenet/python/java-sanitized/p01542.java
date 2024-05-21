import java.util.*;
import java.io.*;

class Main {
    static int f(String s) {
        char[] ca = "01+-*()".toCharArray();
        String[] sa = s.split("\\.");
        int r = -1;
        int sl = sa.length;

        Map<String, Integer> fm = new HashMap<>();
        for (char[] ci : itertools.product(ca, repeat=sl-1)) {
            StringBuilder t = new StringBuilder();
            for (int i = 0; i < ci.length; i++) {
                t.append(sa[i]);
                t.append(ci[i]);
            }
            t.append(sa[sl-1]);
            int tr = f(t.toString(), fm);
            if (tr!= -1) {
                tr = Integer.parseInt(Integer.toBinaryString(tr), 2);
                if (tr >= 1024 || tr < 0) {
                    tr = -1;
                }
            }
            if (r < tr) {
                r = tr;
            }
        }
        return r;
    }

    static int f(String s, Map<String, Integer> fm) {
        if (fm.containsKey(s)) {
            return fm.get(s);
        }
        if (s.contains(")")) {
            int ri = s.indexOf(")");
            if (s.length() > ri+1 && s.charAt(ri+1) >= '0' && s.charAt(ri+1) <= '1') {
                fm.put(s, -1);
                return -1;
            }
            int li = -1;
            for (int i = ri-1; i >= 0; i--) {
                if (s.charAt(i) == '(') {
                    li = i;
                    break;
                }
            }
            if (li < 0 || li > 0 && s.charAt(li-1) >= '0' && s.charAt(li-1) <= '1') {
                fm.put(s, -1);
                return -1;
            }
            String ts = s.substring(li+1, ri);
            if (!ts.contains("+") &&!ts.contains("-") &&!ts.contains("*")) {
                fm.put(s, -1);
                return -1;
            }
            int tr = f(ts, fm);
            if (tr == -1) {
                fm.put(s, -1);
                return -1;
            }
            int fr = f(s.substring(0, li) + tr + s.substring(ri+1), fm);
            fm.put(s, fr);
            return fr;
        }
        if (s.contains("(")) {
            fm.put(s, -1);
            return -1;
        }

        int l = s.length();
        if (s.contains("*")) {
            int oi = s.indexOf("*");
            int li = oi;
            for (int i = oi-1; i >= 0; i--) {
                if (s.charAt(i) < '0' || s.charAt(i) > '1') {
                    break;
                }
                li = i;
            }
            int ri = oi;
            for (int i = oi+1; i < l; i++) {
                if (s.charAt(i) < '0' || s.charAt(i) > '1') {
                    break;
                }
                ri = i;
            }
            if (li == oi || ri == oi) {
                fm.put(s, -1);
                return -1;
            }
            int t = Integer.parseInt(s.substring(li, oi), 2);
            int u = Integer.parseInt(s.substring(oi+1, ri+1), 2);
            int tu = t * u;
            if (t < 0 || t >= 1024 || u < 0 || u >= 1024 || tu < 0 || tu >= 1024) {
                fm.put(s, -1);
                return -1;
            }
            String ts = Integer.toBinaryString(tu);
            int fr = f(s.substring(0, li) + ts + s.substring(ri+1), fm);
            fm.put(s, fr);
            return fr;
        }
        int pi = s.indexOf("+");
        int mi = s.indexOf("-");
        int oi = Math.min(pi, mi);
        int li = oi;
        for (int i = oi-1; i >= 0; i--) {
            if (s.charAt(i) < '0' || s.charAt(i) > '1') {
                break;
            }
            li = i;
        }
        int ri = oi;
        for (int i = oi+1; i < l; i++) {
            if (s.charAt(i) < '0' || s.charAt(i) > '1') {
                break;
            }
            ri = i;
        }
        if (li == oi || ri == oi) {
            fm.put(s, -1);
            return -1;
        }
        int t = Integer.parseInt(s.substring(li, oi), 2);
        int u = Integer.parseInt(s.substring(oi+1, ri+1), 2);
        int tu;
        if (oi == mi) {
            tu = t - u;
        } else {
            tu = t + u;
        }
        if (t < 0 || t >= 1024 || u < 0 || u >= 1024 || tu < 0 || tu >= 1024) {
            fm.put(s, -1);
            return -1;
        }
        String ts = Integer.toBinaryString(tu);
        int fr = f(s.substring(0, li) + ts + s.substring(ri+1), fm);
        fm.put(s, fr);
        return fr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (true) {
            String n = sc.next();
            if (n.equals("0")) {
                break;
            }
            sb.append(f(n)).append("\n");
        }
        System.out.print(sb);
    }
}