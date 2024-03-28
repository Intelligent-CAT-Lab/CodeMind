import java.util.*;

public class atcoder_ABC129_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long mod = (long) Math.pow(10, 9) + 7;
        List<Long> pows = new ArrayList<>();
        pows.add(1);
        for (int i = 1; i <= n; i++) {
            pows.add((pows.get(pows.size() - 1) * 3) % mod);
        }
        long dp = 1;
        for (int i = 0; i < n; i++) {
            if (l[i] == '1') {
                dp = (pows.get(i) + dp * 2) % mod;
            }
        }
        System.out.println(dp);
    }
}