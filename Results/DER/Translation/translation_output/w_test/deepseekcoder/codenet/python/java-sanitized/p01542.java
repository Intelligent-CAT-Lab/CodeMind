import java.util.*;

public class p01542 {
    static Map<String, String> fm = new HashMap<>();
    static int inf = (int)1e9;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> rr = new ArrayList<>();
        while (true) {
            String n = sc.next();
            if (n.equals("0")) {
                break;
            }
            rr.add(f(n));
        }
        for (int r : rr) {
            System.out.println(r);
        }
    }

    static int f(String s) {
        String ca = "01+-*()";
        String[] sa = s.split("\\.");
        int r = -1;
        int sl = sa.length;

        for (String[] comb : generateCombinations(ca, sl-1)) {
            String t = "";
            for (int i = 0; i < comb.length; i++) {
                t += sa[i];
                t += comb[i];
            }
            t += sa[sa.length-1];
            int tr = _f(t);
            if (r < tr) {
                r = tr;
            }
        }
        return r;
    }

    static int _f(String s) {
        if (fm.containsKey(s)) {
            return fm.get(s).equals("-1") ? -1 : Integer.parseInt(fm.get(s), 2);
        }
        if (s.contains(")")) {
            int ri = s.indexOf(')');
            if (