import java.util.Scanner;

public class p03683 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] buf = scanner.nextLine().split(" ");
        int N = Integer.parseInt(buf[0]);
        int M = Integer.parseInt(buf[1]);

        long thres = (long)Math.pow(10, 9) + 7;

        if (Math.abs(N - M) == 1) {
            N = Math.min(N, M);
            long retVal = 1;
            for (int i = 1; i <= N; i++) {
                retVal = (retVal * ((long)Math.pow(i, 2))) % thres;
            }
            retVal = (retVal * (N + 1)) % thres;
            System.out.println(retVal);
        } else if (N == M) {
            long retVal = 2;
            for (int i = 1; i <= N; i++) {
                retVal = (retVal * ((long)Math.pow(i, 2))) % thres;
            }
            System.out.println(retVal);
        } else {
            System.out.println(0);
        }
    }
}