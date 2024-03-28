import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p03331 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(reader.readLine());
        long ans = 1000000000000L;
        
        for (int i = 1; i < N; i++) {
            ans = Math.min(ans, sum_N(i) + sum_N(N - i));
        }
        
        System.out.println(ans);
    }
    
    public static int sum_N(int x) {
        int total = 0;
        while (x > 0) {
            total += x % 10;
            x = x / 10;
        }
        return total;
    }
}