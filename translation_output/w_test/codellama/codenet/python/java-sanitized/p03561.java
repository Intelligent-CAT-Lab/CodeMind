import java.util.Scanner;

public class p03561 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int N = sc.nextInt();
        if (K % 2 == 0) {
            System.out.println(K / 2 + " " + K * (N - 1));
        } else {
            int[] X = new int[(K + 1) / 2];
            for (int i = 0; i < N; i++) {
                if (i == N / 2) {
                    X[i] = 1;
                } else {
                    X[i] = (K + 1) / 2;
                }
            }
            System.out.println(String.join(" ", X));
        }
    }
}