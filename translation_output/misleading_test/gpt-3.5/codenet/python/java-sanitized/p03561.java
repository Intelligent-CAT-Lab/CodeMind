import java.util.Scanner;

public class p03561 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int N = scanner.nextInt();

        if (K % 2 == 0) {
            System.out.print(K / 2 + " ");
            for (int i = 1; i < N; i++) {
                System.out.print(K + " ");
            }
            System.out.println();
        } else {
            int[] X = new int[N];
            int temp = (K + 1) / 2;
            for (int i = 0; i < N; i++) {
                X[i] = temp;
            }

            for (int i = 0; i < N / 2; i++) {
                if (X[N - 1] == 1) {
                    int[] newX = new int[N - 1];
                    System.arraycopy(X, 0, newX, 0, N - 1);
                    X = newX;
                } else {
                    X[N - 1] -= 1;
                    for (int j = X.length; j < N; j++) {
                        X[j] = K;
                    }
                }
            }
            
            for (int value : X) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}