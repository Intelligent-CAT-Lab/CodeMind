import java.util.*;
import java.io.*;

public class p01829 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int l = s.length();
        int n = Integer.parseInt(s);
        int m = Integer.MAX_VALUE;
        String r = "";
        int t = (int) Math.pow(10, l);
        for (int[] a : itertools.permutations(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, l)) {
            int b = 0;
            for (int c : a) {
                b = b * 10 + c;
            }
            int tm = Math.max(Math.abs(n - b), t - Math.abs(n - b));
            if (m > tm) {
                m = tm;
                r = Arrays.toString(a);
            }
        }
        System.out.println(r);
    }
}