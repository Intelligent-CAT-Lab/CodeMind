import java.util.Scanner;

public class p03561 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int N = scanner.nextInt();
        if (K % 2 == 0) {
            System.out.print(K / 2);
            for (int i = 1; i < N; i++) {
                System.out.print(" " + K);
            }
        } else {
            int[] X = new int[(K + 1) / 2];
            for (int i = 0; i < N; i++) {
                X[i % X.length]++;
                if (X[X.length - 1] == 1) {
                    X = removeLastElement(X);
                } else {
                    X[X.length - 1]--;
                    int[] newX = new int[N];
                    System.arraycopy(X, 0, newX, 0, X.length);
                    for (int j = X.length; j < N; j++) {
                        newX[j] = K;
                    }
                    X = newX;
                }
            }
            for (int i : X) {
                System.out.print(" " + i);
            }
        }
    }

    private static int[] removeLastElement(int[] array) {
        int[] newArray = new int[array.length - 1];
        System.arraycopy(array, 0, newArray, 0, array.length - 1);
        return newArray;
    }
}