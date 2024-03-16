import java.util.Arrays;

public class p03188 {
    public static void main(String[] args) {
        int K = Integer.parseInt(args[0]);
        if (K <= 500) {
            for (int i = 1; i <= K; i++) {
                System.out.print(i + " ");
            }
        } else {
            int KUP = (K + 1) / 2 + 3) / 4 * 4;
            System.out.println(KUP);
            int[][] ANS = new int[KUP][KUP];
            int begin = 0;
            for (int i = 0; i < KUP; i++) {
                for (int j = 0; j < KUP; j++) {
                    if (i % 2 == 0) {
                        ANS[i][(j + begin) % KUP] = j + 1;
                    } else {
                        ANS[i][(j + begin) % KUP] = j + 1 + KUP;
                    }
                }
                begin += 1;
            }
            for (int i = 0; i < KUP * 2 - K; i++) {
                for (int j = 0; j < KUP; j++) {
                    for (int l = 0; l < KUP; l++) {
                        if (ANS[j][l] == KUP * 2 - i) {
                            ANS[j][l] = KUP * 2 - i - KUP;
                        }
                    }
                }
            }
            for (int[] ans : ANS) {
                System.out.print(Arrays.toString(ans));
            }
        }
    }
}