```java
import java.util.*;
import java.io.*;

public class Main {

    static int inf = 1000000000;
    static HashMap<String, Integer> fm = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        List<Integer> rr = new ArrayList<>();

        while (true) {
            String n = br.readLine();
            if (n.equals("0")) {
                break;
            }
            rr.add(f(n));
        }

        for (int result : rr) {
            pw.println(result);
        }
        pw.close();
    }

    static int f(String s) {
        String ca = "01+-*()";
        String[] sa = s.split("\\.");
        int r = -1;
        int sl = sa.length;

        fm.clear();

        for (char[] ci : generateCombinations(ca, sl-1)) {
            StringBuilder t = new StringBuilder();
            for (int i = 0; i < ci.length; i++) {
                t.append(sa[i]);
                t.append(ci[i]);
            }
            t.append(sa[sl-1]);
            String tr = _f(t.toString());
            if (!tr.equals("-1")) {
                int trInt = Integer.parseInt(tr, 2);
                if (trInt >= 1024 || trInt < 0) {
                    tr = "-1";
                }
            }
            if (r < Integer.parseInt(tr)) {
                r = Integer.parseInt(tr);
            }
        }

        return r;
    }

    static String _f(String s) {
        if (fm.containsKey(s)) {
            return fm.get(s).toString();
        }

        if (s.contains(")")) {
            int ri = s.indexOf(')');
            if (s.length() > ri+1 && "01".contains(Character.toString(s.charAt(ri+1)))) {
                fm.put(s, -1);
                return "-1";
            }
            int li = -1;
            for (int i = ri-1; i >= 0; i--) {
                if (s.charAt(i) == '(') {
                    li = i;
                    break;
                }
            }
            if (li < 0 || (li > 0 && "01".contains(Character.toString(s.charAt(li-1)))) {
                fm.put(s, -1);
                return "-1";
            }
            String ts = s.substring(li+1, ri);
            if (!ts.contains("+") && !ts.contains("-") && !ts.contains("*")) {
                fm.put(s, -1);
                return "-1";
            }
            String tr = _f(ts);
            if (tr.equals("-1")) {
                fm.put(s, -1);
                return "-1";
            }
            fm.put(s, _f(s.substring(0, li) + tr + s.substring(ri+1)));
            return fm.get(s).toString();
        }

        if (s.contains("(")) {
            fm.put(s, -1);
            return "-1";
        }

        int l = s.length();
        if (s.contains("*")) {
            int oi = s.indexOf('*');
            int li = oi;
            for (int i = oi-1; i >= 0; i--) {
                if (!"01".contains(Character.toString(s.charAt(i)))) {
                    break;
                }
                li = i;
            }
            int ri = oi;
            for (int i = oi+1; i < l; i++) {
                if (!"01".contains(Character.toString(s.charAt(i)))) {
                    break;
                }
                ri = i;
            }
            if (li == oi || ri == oi) {
                fm.put(s, -1);
                return "-1";
            }
            int t = Integer.parseInt(s.substring(li, oi), 2);
            int u = Integer.parseInt(s.substring(oi+1, ri+1), 2);
            int tu = t * u;
            if (t < 0 || t >= 1024 || u < 0 || u >= 1024 || tu < 0 || tu >= 1024) {
                fm.put(s, -1);
                return "-1";
            }
            String ts = Integer.toBinaryString(tu);
            fm.put(s, _f(s.substring(0, li) + ts + s.substring(ri+1)));
            return fm.get(s).toString();
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
            if (t < 0 || t >= 1024) {
                fm.put(s, -1);
            } else {
                fm.put(s, t);
            }
            return fm.get(s).toString();
        }
        int oi = Math.min(pi, mi);
        int li = oi;
        for (int i = oi-1; i >= 0; i--) {
            if (!"01".contains(Character.toString(s.charAt(i)))) {
                break;
            }
            li = i;
        }
        int ri = oi;
        for (int i = oi+1; i < l; i++) {
            if (!"01".contains(Character.toString(s.charAt(i)))) {
                break;
            }
            ri = i;
        }
        if (li == oi || ri == oi) {
            fm.put(s, -1);
            return "-1";
        }
        int t = Integer.parseInt(s.substring(li, oi), 2);
        int u = Integer.parseInt(s.substring(oi+1, ri+1), 2);
        int tu = t + u;
        if (oi == mi) {
            tu = t - u;
        }
        if (t < 0 || t >= 1024 || u < 0 || u >= 1024 || tu < 0 || tu >= 1024) {
            fm.put(s, -1);
            return "-1";
        }
        String ts = Integer.toBinaryString(tu);
        fm.put(s, _f(s.substring(0, li) + ts + s.substring(ri+1)));
        return fm.get(s).toString();
    }

    static List<char[]> generateCombinations(String ca, int length) {
        List<char[]> result = new ArrayList<>();
        char[] availableChars = ca.toCharArray();

        generateCombinationsHelper(result, new char[length], availableChars, 0);

        return result;
    }

    static void generateCombinationsHelper(List<char[]> result, char[] current, char[] available, int index) {
        if (index == current.length) {
            result.add(current.clone());
        } else {
            for (char c : available) {
                current[index] = c;
                generateCombinationsHelper(result, current, available, index + 1);
            }
        }
    }

}
```

