import java.util.*;

public class p02554 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ant = 1, bnt = 1, cnt = 1;
        long mod = 10000000007L;

        for (int i = 0; i < n; i++) {
            ant = (10 * ant) % mod;
            bnt = (9 * bnt) % mod;
            cnt = (8 * cnt) % mod;
        }

        long ans = (ant - (2 * bnt - cnt) + mod) % mod;
        System.out.println(ans);
    }
}