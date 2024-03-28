import java.util.*;

public class p01542 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = -1;
        String[] sa = new String[n];
        for (int i = 0; i < n; i++) {
            sa[i] = sc.next();
        }
        String ca = "01+-*()";
        for (int i = 0; i < ca.length(); i++) {
            String t = "";
            for (int j = 0; j < sa.length; j++) {
                t += sa[j];
                t += ca.charAt(i);
            }
            t += sa[sa.length - 1];
            int tr = f(t);
            if (tr != -1 && r < tr) {
                r = tr;
            }
        }
        System.out.println(r);
    }

    public static int f(String s) {
        int pi = Integer.MAX_VALUE;
        int mi = Integer.MAX_VALUE;
        int li = 0;
        int ri = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '+') {
                pi = i;
            } else if (s.char