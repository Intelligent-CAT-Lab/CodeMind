import java.util.Scanner;

public class p00389 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int t = N = a = 1;
        while (true) {
            N = (K + a - 1) / K;
            a += N;
            if (N < a) {
                break;
            }
            t++;
        }
        System.out.println(t);
    }
}