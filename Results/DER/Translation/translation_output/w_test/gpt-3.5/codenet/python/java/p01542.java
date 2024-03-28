```java
import java.util.*;
import java.io.*;

public class Main {

    static int inf = 1000000000;
    static int[][] dd = {{-1,0},{0,1},{1,0},{0,-1}};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        List<Integer> results = new ArrayList<>();

        while (true) {
            String n = br.readLine();
            if (n.equals("0")) {
                break;
            }
            results.add(f(n));
        }

        for (int result : results) {
            pw.println(result);
        }

        pw.close();
    }

    static int f(String s) {
        char[] ca = {'0', '1', '+', '-', '*', '('};
        String[] sa = s.split("\\.");
        int r = -1;
        int sl = sa.length;

        Map<String, Integer> fm = new HashMap<>();

        return r;
    }

    static int _f(String s, Map<String, Integer> fm) {
        if (fm.containsKey(s)) {
            return fm.get(s);
        }
        if (s.contains(")")) {
            int ri = s.indexOf(')');
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
            if (li < 0 || (li > 0 && (s.charAt(li-1) == '0' || s.charAt(li-1) == '1'))) {
                fm.put(s, -1);
                return -1;
            }
            String ts = s.substring(li+1, ri);
            if (!ts.contains("+") && !ts.contains("-") && !ts.contains("*")) {
                fm.put(s, -1);
                return -1;
            }
            int tr = _f(ts, fm);
            if (tr == -1) {
                fm.put(s, -1);
                return -1;
            }
            fm.put(s, _f(s.substring(0, li) + tr + s.substring(ri+1), fm));
            return fm.get(s);
        }
        if (s.contains("(")) {
            fm.put(s, -1);
            return -1;
        }

        int l = s.length();
        if (s.contains("*")) {
            int oi = s.indexOf('*');
            int li = oi;
            for (int i = oi-1; i >= 0; i--) {
                if (s.charAt(i) != '0' && s.charAt(i) != '1') {
                    break;
                }
                li = i;
            }
            int ri = oi;
            for (int i = oi+1; i < l; i++) {
                if (s.charAt(i) != '0' && s.charAt(i) != '1') {
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
            fm.put(s, _f(s.substring(0, li) + ts + s.substring(ri+1), fm));
            return fm.get(s);
        }
        int pi = inf;
        int mi = inf;
        if (s.contains("+")) {
            pi = s.indexOf('+');
        }
        if (s.contains("-")) {
            mi = s.indexOf('-');
        }
        if (pi == inf && mi == inf) {
            int t = Integer.parseInt(s, 2);
            fm.put(s, t);
            if (t < 0 || t >= 1024) {
                fm.put(s, -1);
            }
            return fm.get(s);
        }
        int oi = Math.min(pi, mi);
        int li = oi;
        for (int i = oi-1; i >= 0; i--) {
            if (s.charAt(i) != '0' && s.charAt(i) != '1') {
                break;
            }
            li = i;
        }
        int ri = oi;
        for (int i = oi+1; i < l; i++) {
            if (s.charAt(i) != '0' && s.charAt(i) != '1') {
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
        int tu = t + u;
        if (oi == mi) {
            tu = t - u;
        }
        if (t < 0 || t >= 1024 || u < 0 || u >= 1024 || tu < 0 || tu >= 1024) {
            fm.put(s, -1);
            return -1;
        }
        String ts = Integer.toBinaryString(tu);
        fm.put(s, _f(s.substring(0, li) + ts + s.substring(ri+1), fm));
        return fm.get(s);
    }
}
```
