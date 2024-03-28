import java.util.*;
import java.util.function.*;

public class p02938 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();
        sc.close();
        int MOD = 1000000007;
        BiFunction<Integer, Integer, Integer> solve = new BiFunction<Integer, Integer, Integer>() {
            public Integer apply(Integer L, Integer R) {
                if (L > R) return 0;
                if (L == 1) return (1 + apply(2, R)) % MOD;
                return (apply(L/2, (R-1)/2) + apply((L+1)/2, R/2) + apply((L+1)/2, (R-1)/2)) % MOD;
            }
        };
        System.out.println(solve.apply(L, R));
    }
}