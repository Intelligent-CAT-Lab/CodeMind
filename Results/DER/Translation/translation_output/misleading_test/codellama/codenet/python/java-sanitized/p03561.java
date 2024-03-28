import java.util.Scanner;

public class p03561 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int N = sc.nextInt();
        if (K % 2 == 0) {
            System.out.println(K / 2 + " " + K + " " + K + " " + K + " " + K);
        } else {
            int X = (K + 1) / 2;
            for (int i = 0; i < N; i++) {
                if (i == N / 2) {
                    if (X == 1) {
                        X = 0;
                    } else {
                        X--;
                    }
                }
                System.out.print(X + " ");
            }
        }
    }
}