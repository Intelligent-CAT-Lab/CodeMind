import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int l = s.length();
        int n = Integer.parseInt(s);
        int m = Integer.MAX_VALUE;
        int r = 0;
        int t = (int)Math.pow(10, l);
        for (int[] a : new ArrayList<int[]>(Arrays.asList(new int[l]))) {
            int b = 0;
            for (int c : a) {
                b = b * 10 + c;
            }
            int tm = Math.max(Math.abs(n-b), t-Math.abs(n-b));
            if (m > tm) {
                m = tm;
                r = Integer.parseInt(Arrays.toString(a).replaceAll("[^0-9]", ""));
            }
        }
        System.out.println(r);
    }
}