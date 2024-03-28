import java.util.Scanner;

public class p03766 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 1) {
            System.out.println(1);
        } else {
            int[] resV = new int[n + 1];
            int[] resVCumsum = new int[n + 1];
            resV[0] = 0;
            resV[1] = 1;
            resV[2] = 1;
            resVCumsum[0] = 0;
            resVCumsum[1] = 1;
            resVCumsum[2] = 2;

            int M = 1000000007;

            for (int k = 3; k <= n; k++) {
                resV[k] = (1 + resVCumsum[k - 1] - resV[k - 2]) % M;
                resVCumsum[k] = (resVCumsum[k - 1] + resV[k]) % M;
            }

            System.out.println((((resVCumsum[n - 2] * (((n - 1) * (n - 1)) % M)) % M) + ((resVCumsum[n - 1] * (n - 1)) % M) + n + (n - 1) * (n - 1) % M) % M);
        }
    }
}