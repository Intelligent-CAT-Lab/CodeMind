import java.util.Scanner;

public class p02584 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int K = sc.nextInt();
        int D = sc.nextInt();
        sc.close();

        // 原点に近い位置までの移動回数を求める
        int count = Math.abs(X) / D;
        int ans = 0;

        // Kの方が小さければ可能な限り原点に近い位置を求める
        if (count > K) {
            ans = Math.abs(X) - D * K;
        } else {
            // 残りの移動回数が偶数
            if ((K - count) % 2 == 0) {
                ans = Math.abs(X) % D;
            }
            // 残りの移動回数が奇数
            else {
                ans = Math.abs(Math.abs(X) % D - D);
            }
        }
        System.out.println(ans);
    }
}