import java.util.Scanner;

public class p02755 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        boolean f = false;
        int ans = 0;
        
        int n = A * 100 / 8;
        int m = (A + 1) * 100 / 8;
        
        for (int i = n; i <= m; i++) {
            if (i * 8 / 100 == A && i / 10 == B) {
                f = true;
                ans = i;
                break;
            }
        }
        
        System.out.println(f ? ans : -1);
        scanner.close();
    }
}