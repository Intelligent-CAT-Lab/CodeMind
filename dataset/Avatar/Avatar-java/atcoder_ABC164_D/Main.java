import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int N = S.length();
        int[] mod_arr = new int[N];
        int[] mod_cnt = new int[2019];
        int radix = 1;
        
        for (int i = 0; i < N; i++) {
            int tmp = ((int) S.charAt(N - 1 - i) - (int) '0') * radix % 2019;
            if (i != 0) {
                tmp = (tmp + mod_arr[i - 1]) % 2019;
            }
            mod_arr[i] = tmp;
            mod_cnt[tmp]++;
            radix = radix * 10 % 2019;
        }
        
        long ans = 0L;
        mod_cnt[0]++;
        
        for (int i = 0; i < 2019; i++) {
            ans += mod_cnt[i] * (mod_cnt[i] - 1) / 2;
        }
        
        System.out.println(ans);
    }
}