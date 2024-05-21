import java.util.*;

public class p03666 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        for (int k = 0; k <= N; k++) {
            int j = N - 1 - k;
            if (D * k - C * j >= B - A && B - A >= C * k - D * j) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}