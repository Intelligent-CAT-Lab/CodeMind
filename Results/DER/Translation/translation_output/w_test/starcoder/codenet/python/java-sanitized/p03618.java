import java.util.*;
import java.io.*;

public class p03618 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int res = n * (n - 1) / 2 + 1;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    res--;
                }
            }
        }
        System.out.println(res);
    }
}