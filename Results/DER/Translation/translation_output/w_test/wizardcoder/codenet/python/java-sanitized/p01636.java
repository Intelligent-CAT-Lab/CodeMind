import java.util.Scanner;

public class p01636 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for (int i = 1; i < n; i++) {
            String df = a.substring(0, i);
            String sm = a.substring(i);
            if (sm.charAt(0) == '0') continue;
            df = Integer.parseInt(df);
            sm = Integer.parseInt(sm);
            if ((df + sm) % 2 == 0 && sm >= df && (sm - df) % 2 == 0) {
                ans++;
            }
        }
        if (n % 2 == 0) ans++;
        System.out.println(ans);
    }
}