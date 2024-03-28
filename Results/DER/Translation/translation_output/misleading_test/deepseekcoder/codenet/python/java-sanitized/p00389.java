import java.util.Scanner;

public class p00389 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int n = 1, a = 1, t = 1;
        while (true) {
            n = (K + a - 1) / K;
            a += n;
            if (N < a) break;
            t += 1;
        }
        System.out.println(t);
    }
}