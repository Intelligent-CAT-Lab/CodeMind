import java.util.Scanner;

public class p03666 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();

        for (int k = 0; k <= N; k++) {
            int j = N - 1 - k;
            if (D*k - C*j >= B-A && B-A >= C*k - D*j) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}