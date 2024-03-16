import java.util.Scanner;

public class p01945 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] S = scanner.nextLine().toCharArray();

        int N = -1;
        for (int i = 0; i < S.length; i++) {
            if (S[i] == '*') {
                N = i;
                break;
            }
        }

        int P = 0;
        for (int i = 0; i < N; i++) {
            if (S[i] == '(') {
                P++;
            } else if (S[i] == ')') {
                P--;
            }
        }
        P = Math.abs(P);

        int Q = 0;
        for (int i = N + 1; i < S.length; i++) {
            if (S[i] == '(') {
                Q++;
            } else if (S[i] == ')') {
                Q--;
            }
        }
        Q = Math.abs(Q);

        System.out.println(Math.min(P, Q));
    }
}