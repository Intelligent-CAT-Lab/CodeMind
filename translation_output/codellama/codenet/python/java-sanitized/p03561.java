import java.util.Scanner;

public class p03561 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int N = scanner.nextInt();
        if (K % 2 == 0) {
            System.out.println(K / 2);
            for (int i = 1; i < N; i++) {
                System.out.print(K);
            }
        } else {
            int X = (K + 1) / 2;
            for (int i = 0; i < N; i++) {
                if (i == N / 2) {
                    if (X == 1) {
                        System.out.print(X);
                    } else {
                        System.out.print(X - 1);
                        for (int j = 1; j < N - i; j++) {
                            System.out.print(K);
                        }
                    }
                } else {
                    System.out.print(X);
                }
            }
        }
    }
}