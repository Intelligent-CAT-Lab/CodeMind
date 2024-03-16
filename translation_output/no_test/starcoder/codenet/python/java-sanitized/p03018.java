import java.util.*;
public class p03018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans = 0;
        int a = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                a++;
            } else if (s.substring(i, i + 2).equals("BC")) {
                ans += a;
                i += 2;
            } else {
                a = 0;
            }
        }
        System.out.println(ans);
    }
}