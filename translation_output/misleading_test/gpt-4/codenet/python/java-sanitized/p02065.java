import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class p02065 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int mod = scanner.nextInt();
        
        Map<Pair, Integer>[] dp = new HashMap[2 * N];
        
        for (int i = 0; i < 2 * N; i++) {
            dp[i] = new HashMap<>();
        }
        
        dp[0].put(new Pair(null, new int[]{0}), 1);
        
        for (int i = 0; i < 2 * N - 1; i++) {
            for (Map.Entry<Pair, Integer> entry : dp[i].entrySet()) {
                Pair pair = entry.getKey();
                Integer left = pair.left;
                int[] top = pair.top;
                int v = entry.getValue();
                
                if (top.length > K + 1)
                    continue;
                
                if (left == null) {
                    if (top.length > 1 && i + 1 - top[0] <= K) {
                        dp[i + 1].merge(new Pair(i + 1, copyOfRange(top, 0, top.length)), v, (a, b) -> (a + b) % mod);
                    }
                } else {
                    if (i + 1 - left <= K && top.length > 2 && i + 1 - top[1] <= K) {
                        dp[i + 1].merge(new Pair(i + 1, copyOfRange(top, 1, top.length)), v, (a, b) -> (a + b) % mod);
                    }
                }
                
                if (top.length > 1 && i + 1 - top[top.length - 1] <= K) {
                    int[] newTop = copyAndAppend(top, i + 1);
                    dp[i + 1].merge(new Pair(left, newTop), v, (a, b) -> (a + b) % mod);
                }
            }
        }
        
        int res = 0;
        for (Map.Entry<Pair, Integer> entry : dp[2 * N - 1].entrySet()) {
            Pair pair = entry.getKey();
            int[] top = pair.top;
            int v = entry.getValue();
            
            if (top.length == 2) {
                assert pair.left.equals(2 * N - 1);
                res = (res + v) % mod;
            }
        }
        
        System.out.println(res);
        
        scanner.close();
    }
    
    private static class Pair {
        Integer left;
        int[] top;
        
        public Pair(Integer left, int[] top) {
            this.left = left;
            this.top = top;
        }
        
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair pair = (Pair) o;
            if (left != null ? !left.equals(pair.left) : pair.left != null) return false;
            if (top.length != pair.top.length) return false;
            for (int i = 0; i < top.length; i++) {
                if (top[i] != pair.top[i]) return false;
            }
            return true;
        }
        
        @Override
        public int hashCode() {
            int result = left != null ? left.hashCode() : 0;
            for (int i : top) {
                result = 31 * result + i;
            }
            return result;
        }
    }
    
    private static int[] copyOfRange(int[] original, int from, int to) {
        int[] result = new int[to - from];
        System.arraycopy(original, from, result, 0, to - from);
        return result;
    }
    
    private static int[] copyAndAppend(int[] original, int element) {
        int[] result = new int[original.length + 1];
        System.arraycopy(original, 0, result, 0, original.length);
        result[original.length] = element;
        return result;
    }
}