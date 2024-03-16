import java.util.Scanner;

public class p03281 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        int cnt = 0;
        for (int j = 1; j <= n; j++) {
            if (j % 2 == 0) {
                continue;
            }
            if (cnt_divisor(j) == 8) {
                cnt++;
            }
        }
        
        System.out.println(cnt);
        scanner.close();
    }
    
    public static int cnt_divisor(int n) {
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                cnt++;
            }
        }
        return cnt;
    }
}