import java.util.*;
public class p01636 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for (int i = 1; i < n; i++) {
            String df = sc.next();
            String sm = sc.next();
            if (sm.charAt(0) == '0') continue;
            df = Integer.toString(Integer.parseInt(df));
            sm = Integer.toString(Integer.parseInt(sm));
            if ((Integer.parseInt(df) + Integer.parseInt(sm)) % 2 == 0 && Integer.parseInt(sm) >= Integer.parseInt(df) && (Integer.parseInt(sm) - Integer.parseInt(df)) % 2 == 0) {
                ans += 1;
            }
        }
        if (n % 2 == 0) ans += 1;
        System.out.println(ans);
    }
}