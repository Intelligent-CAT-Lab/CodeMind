import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class p00957 {
    private static final Map<String, Long> memo = new HashMap<>();
    
    private static long rec(int i, boolean isBlack, int k) {
        if (i < 0) return 0;
        if (i == 0) return isBlack ? 0 : 1;
        
        String key = i + "," + isBlack;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }
        
        long result;
        if (isBlack) {
            result = rec(i - 1, false, k) + rec(i - k, false, k);
        } else {
            result = rec(i - 1, true, k);
        }
        
        memo.put(key, result);
        return result;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();

        long ans = 0;
        for (int i = 1; i <= l; i++) {
            ans += rec(i, true, k);
        }
        
        System.out.println(ans);
    }
}