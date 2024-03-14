import java.util.*;
import java.io.*;

public class p01829 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int l = s.length();
        int n = Integer.parseInt(s);
        int m = Integer.MAX_VALUE;
        String r = "";
        int t = (int) Math.pow(10, l);
        for (int[] a : new int[10][l]) {
            int b = 0;
            for (int i = 0; i < l; i++) {
                b = b * 10 + a[i];
            }
            int tm = Math.max(Math.abs(n - b), t - Math.abs(n - b));
            if (m > tm) {
                m = tm;
                r = "";
                for (int i = 0; i < l; i++) {
                    r += a[i];
                }
            }
        }
        System.out.println(r);
    }
}