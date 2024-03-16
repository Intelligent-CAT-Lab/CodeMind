import java.util.Scanner;
import java.util.Arrays;

public class p03748 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] dpT = new int[N + 1];
        int[] dpF = new int[N + 1];
        dpT[0] = 1;
        dpF[0] = 0;

        for (int i = 0; i < M; i++) {
            int[] prevT = dpT;
            int[] prevF = dpF;
            dpT = new int[N + 1];
            dpF = new int[N + 1];
            for (int j = 0; j < N; j++) {
                dpT[j] = (prevT[j] + prevF[j + 1]) % M;
                dpF[j] = (prevF[j] + prevT[j + 1]) % M;
            }
            dpT[N] = (prevT[N] + prevF[1]) % M;
            dpF[N] = (prevF[N] + prevT[1]) % M;
        }

        int answer = 0;
        for (int i = 0; i < N + 1; i++) {
            answer += dpT[i];
        }
        System.out.println(answer % M);
    }
}