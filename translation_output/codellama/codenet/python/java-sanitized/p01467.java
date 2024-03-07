import java.util.Scanner;

public class p01467 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[scanner.nextInt()];
        int[] B = new int[scanner.nextInt()];
        int K = scanner.nextInt();
        int[] C = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            A[i] = scanner.nextInt();
        }

        for (int i = 0; i < B.length; i++) {
            B[i] = scanner.nextInt();
        }

        for (int i = A.length - 1; i >= 0; i--) {
            if (A[i] - B[i] >= 0) {
                C[i] = A[i] - B[i];
            } else {
                C[i] = A[i] - B[i] + 10;
            }
        }

        int result = 0;
        for (int i = 0; i < C.length; i++) {
            result += C[i];
        }

        System.out.println(result);
    }
}