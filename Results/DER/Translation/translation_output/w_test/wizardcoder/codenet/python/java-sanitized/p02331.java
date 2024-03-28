import java.util.*;

public class p02331 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int mod = (int) Math.pow(10, 9) + 7;
        int ans = (int) Math.pow(k, n) % mod;
        System.out.println(ans);
    }
}