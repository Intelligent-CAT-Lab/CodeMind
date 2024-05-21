import java.util.*;

public class p02702 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] remain = new int[2019];
        int now = 0;
        long ans = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            now = (now + Integer.parseInt(String.valueOf(s.charAt(i))) * (int) Math.pow(10, s.length() - i - 1) % 2019) % 2019;
            ans += remain[now];
            remain[now]++;
        }
        ans += remain[0];
        System.out.println(ans);
    }
}