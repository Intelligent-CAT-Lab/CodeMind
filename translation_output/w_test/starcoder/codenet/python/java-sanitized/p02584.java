import java.util.*;
public class p02584 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int X = in.nextInt();
        int K = in.nextInt();
        int D = in.nextInt();
        int count = Math.abs(X) / D;
        int ans = 0;
        if (count > K) {
            ans = Math.abs(X) - D * K;
        } else {
            if ((K - count) % 2 == 0) {
                ans = Math.abs(X) % D;
            } else {
                ans = Math.abs(Math.abs(X) % D - D);
            }
        }
        System.out.println(ans);
    }
}