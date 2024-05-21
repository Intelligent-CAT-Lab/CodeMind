import java.util.*;

public class p03947 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int ans = 0;
        for (int i = 0; i < S.length() - 1; i++) {
            if (S.charAt(i)!= S.charAt(i + 1)) {
                ans += 1;
            }
        }
        System.out.println(ans);
    }
}