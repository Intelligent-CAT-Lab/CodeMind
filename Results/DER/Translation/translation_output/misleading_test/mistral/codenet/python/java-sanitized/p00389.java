import java.util.Scanner;

public class p00389 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int t = 1, a = 1;
        while (true) {
            a = (K + a - 1) / K;
            t += 1;
            if (N < a) {
                break;
            }
        }
        System.out.println(t);
    }
}