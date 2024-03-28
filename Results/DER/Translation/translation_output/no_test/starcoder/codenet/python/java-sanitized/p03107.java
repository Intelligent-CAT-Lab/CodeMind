import java.util.*;
public class p03107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int c0 = 0, c1 = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '0') c0++;
            else c1++;
        }
        System.out.println(2 * Math.min(c0, c1));
    }
}