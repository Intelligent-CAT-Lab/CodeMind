import java.util.Scanner;

public class p03766 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 1) {
            System.out.println(1);
            return;
        }

        int[] resV = new int[n + 1];
        int[] resVCumSum = new int[n + 1];
        resV[0] = 0;
        resV[1] = 1;
        resV[2] = 1;
        resVCumSum[0] = 0;
        resVCumSum[1] = 1;
        resVCumSum[2] = 2;

        int M = 1000000007;

        for (int k = 3; k <= n; k++) {
            resV[k] = (1 + resVCumSum[k - 1] - resV[k - 2]) % M;
            resVCumSum[k] = (resVCumSum[k - 1] + resV[k]) % M;
        }

        System.out.println((((resVCumSum[n - 2] * (((n - 1) * (n - 1)) % M)) % M) + ((resVCumSum[n - 1] * (n - 1)) % M) + n + (n - 1) * (n - 1) % M) % M);
    }
}