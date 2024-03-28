import java.util.Scanner;

public class p03683 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int thres = 1000000007;

        if (Math.abs(N - M) == 1) {
            N = Math.min(N, M);
            int retVal = 1;
            for (int i = 1; i <= N; i++) {
                retVal *= (i * i);
                if (retVal >= thres) {
                    retVal = retVal % thres;
                }
            }
            retVal *= (N + 1);
            if (retVal >= thres) {
                retVal = retVal % thres;
            }
            System.out.println(retVal);
        } else if (N == M) {
            int retVal = 2;
            for (int i = 1; i <= N; i++) {
                retVal *= (i * i);
                if (retVal >= thres) {
                    retVal = retVal % thres;
                }
            }
            System.out.println(retVal);
        } else {
            System.out.println(0);
        }
    }
}