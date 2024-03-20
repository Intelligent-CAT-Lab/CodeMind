import java.util.Scanner;

public class p01636 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for (int i = 1; i < n; i++) {
            String df = n.substring(0, i);
            String sm = n.substring(i);
            if (sm.charAt(0) == '0') continue;
            df = Integer.toString(Integer.parseInt(df));
            sm = Integer.toString(Integer.parseInt(sm));
            if ((Integer.parseInt(df) + Integer.parseInt(sm)) % 2 == 0 && Integer.parseInt(sm) >= Integer.parseInt(df) && (Integer.parseInt(sm) - Integer.parseInt(df)) % 2 == 0) {
                ans++;
            }
        }
        if (n % 2 == 0) ans++;
        System.out.println(ans);
    }
}