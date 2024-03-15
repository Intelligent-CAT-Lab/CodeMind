import java.util.Scanner;

public class p02584 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int K = scanner.nextInt();
        int D = scanner.nextInt();
        
        int count = Math.abs(X) / D;
        int ans = 0;
        
        if(count > K) {
            ans = Math.abs(X) - D * K;
        } else {
            if((K - count) % 2 == 0) {
                ans = Math.abs(X) % D;
            } else {
                ans = Math.abs(Math.abs(X) % D - D);
            }
        }
        
        System.out.println(ans);
    }
}