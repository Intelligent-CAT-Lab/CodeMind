import java.util.*;
import java.io.*;

public class p03018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans = 0;
        int a = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                a++;
            } else if (s.charAt(i) == 'B' && i < s.length() - 1 && s.charAt(i + 1) == 'C') {
                ans += a;
            }
        }
        System.out.println(ans);
    }
}