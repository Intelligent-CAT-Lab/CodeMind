import java.util.Scanner;

public class p03418 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read values of N and K from input
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.close();
        
        long count = 0;
        
        for (int i = K + 1; i <= N; i++) {
            count += ((N + 1) / i) * (i - K) + Math.max(0, (N + 1) % i - K);
        }
        
        if (K == 0) {
            count -= (N - K);
        }
        
        System.out.println(count);
    }
}