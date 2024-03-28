import java.util.Scanner;

public class p01636 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        int ans = 0;
        for (int i = 1; i < a.length(); i++) {
            String df = a.substring(0, i);
            String sm = a.substring(i);
            if (sm.charAt(0) == '0') continue;
            df = Integer.toString(Integer.parseInt(df));
            sm = Integer.toString(Integer.parseInt(sm));
            if ((Integer.parseInt(df) + Integer.parseInt(sm)) % 2 == 0 && Integer.parseInt(sm) >= Integer.parseInt(df) && (Integer.parseInt(sm) - Integer.parseInt(df)) % 2 == 0) {
                ans += 1;
            }
        }
        if (Integer.parseInt(a) % 2 == 0) ans += 1;
        System.out.println(ans);
    }
}