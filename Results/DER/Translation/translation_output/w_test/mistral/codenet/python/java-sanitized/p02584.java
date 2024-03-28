import java.util.*;

public class p02584 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X, K, D;
        X = sc.nextInt();
        K = sc.nextInt();
        D = sc.nextInt();
        int count = Math.abs(X) / D;
        int ans = 0;
        // K's direction is down, so it's possible to get X back to the origin by subtracting D * K
        if (count > K) {
            ans = Math.abs(X) - D * K;
        } else {
            // If (K-count)%2==0, then X is even and can be divided by D
            if ((K - count) % 2 == 0) {
                ans = Math.abs(X) % D;
            } else {
                // If (K-count)%2!=0, then X is odd and can be divided by D-1
                ans = Math.abs(Math.abs(X) % D - D);
            }
        }
        System.out.println(ans);
    }
}