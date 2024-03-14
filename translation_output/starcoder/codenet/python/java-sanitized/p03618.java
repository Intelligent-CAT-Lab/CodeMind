import java.util.*;
import java.io.*;

public class p03618 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s = s.substring(0, s.length() - 1);
        s = s.substring(1);
        s = s + s.charAt(0);
        int n = s.length();
        int res = n * (n - 1) / 2 + 1;
        for (int i = 0; i < n; i++) {
            int cnt = 1;
            for (int j = i + 1; j < n; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    cnt++;
                }
            }
            res -= cnt * (cnt - 1) / 2;
        }
        System.out.println(res);
    }
}