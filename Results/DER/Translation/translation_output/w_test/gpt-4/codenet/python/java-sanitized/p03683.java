import java.util.Scanner;

public class p03683 {
    final static long THRES = 1000000007L;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] buf = scanner.nextLine().split("\\s");
        int N = Integer.parseInt(buf[0]);
        int M = Integer.parseInt(buf[1]);
        
        if (Math.abs(N - M) == 1) {
            N = Math.min(N, M);
            long retVal = 1;
            for (int i = 1; i <= N; i++) {
                retVal *= (long)i * i;
                if (retVal >= THRES) {
                    retVal = retVal % THRES;
                }
            }
            retVal *= (N + 1);
            if (retVal >= THRES) {
                retVal = retVal % THRES;
            }
            System.out.println(retVal);
        } else if (N == M) {
            long retVal = 2;
            for (int i = 1; i <= N; i++) {
                retVal *= (long)i * i;
                if (retVal >= THRES) {
                    retVal = retVal % THRES;
                }
            }
            System.out.println(retVal);
        } else {
            System.out.println(0);
        }
        
        scanner.close();
    }
}