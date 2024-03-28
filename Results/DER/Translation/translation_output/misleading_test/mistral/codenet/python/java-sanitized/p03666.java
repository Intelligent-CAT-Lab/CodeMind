import java.util.*;

public class p03666 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int[] arr = new int[N + 1];
        for (int i = 0; i <= N; i++) {
            arr[i] = sc.nextInt();
        }
        for (int k = 1; k <= N; k++) {
            int j = N - k;
            if (D * k - C * j >= B - A && D * k - C * j >= B - A) {
                System.out.println("YES");
                break;
            }
        }
        if (k > N) {
            System.out.println("NO");
        }
    }
}