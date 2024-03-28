import java.util.Scanner;

public class p00389 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N, K;
        N = scanner.nextInt();
        K = scanner.nextInt();
        int t = 1, n = 1, a = 1;
        while (true) {
            n = (K + a - 1) / K;
            a += n;
            if (N < a) {
                break;
            }
            t++;
        }
        System.out.println(t);
    }
}