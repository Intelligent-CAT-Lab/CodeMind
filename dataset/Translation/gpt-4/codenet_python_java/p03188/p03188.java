import java.util.Scanner;

public class p03188 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();

        if (K <= 500) {
            System.out.println(K);
            for (int i = 1; i <= K; ++i) {
                for (int j = 0; j < K; ++j) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        } else {
            int KUP = (((K + 1) / 2 + 3) / 4) * 4;
            System.out.println(KUP);

            int[][] ANS = new int[KUP][KUP];

            int begin = 0;
            for (int i = 0; i < KUP; ++i) {
                for (int j = 0; j < KUP; ++j) {
                    if (i % 2 == 0) {
                        ANS[i][(j + begin) % KUP] = j + 1;
                    } else {
                        ANS[i][(j + begin) % KUP] = j + 1 + KUP;
                    }
                }
                begin++;
            }

            for (int i = 0; i < KUP * 2 - K; ++i) {
                for (int j = 0; j < KUP; ++j) {
                    for (int l = 0; l < KUP; ++l) {
                        if (ANS[j][l] == KUP * 2 - i) {
                            ANS[j][l] = KUP * 2 - i - KUP;
                        }
                    }
                }
            }

            for (int[] ans : ANS) {
                for (int num : ans) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }
        scanner.close();
    }
}