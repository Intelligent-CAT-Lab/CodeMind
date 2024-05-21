import java.util.*;

public class p03683 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int thres = 100000007;
        if (Math.abs(N - M) == 1) {
            int min = Math.min(N, M);
            long retVal = 1;
            for (int i = 1; i <= min; i++) {
                retVal *= (long) i * i;
                if (retVal >= thres) {
                    retVal = retVal % thres;
                }
            }
            retVal *= (min + 1);
            if (retVal >= thres) {
                retVal = retVal % thres;
            }
            System.out.println(retVal);
        } else if (N == M) {
            long retVal = 2;
            for (int i = 1; i <= N; i++) {
                retVal *= (long) i * i;
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