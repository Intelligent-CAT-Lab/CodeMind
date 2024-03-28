import java.util.Scanner;

public class p03683 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] buf = sc.nextLine().split(" ");
        int N = Integer.parseInt(buf[0]);
        int M = Integer.parseInt(buf[1]);
        
        int thres = 1000000007;

        if (Math.abs(N - M) == 1) {
            N = Math.min(N, M);
            long retVal = 1;
            for (int i = 1; i <= N; i++) {
                retVal *= Math.pow(i, 2);
                if (retVal >= thres) {
                    retVal %= thres;
                }
            }
            retVal *= (N + 1);
            if (retVal >= thres) {
                retVal %= thres;
            }
            System.out.println(retVal);
        } else if (N == M) {
            long retVal = 2;
            for (int i = 1; i <= N; i++) {
                retVal *= Math.pow(i, 2);
                if (retVal >= thres) {
                    retVal %= thres;
                }
            }
            System.out.println(retVal);
        } else {
            System.out.println(0);
        }
    }
}