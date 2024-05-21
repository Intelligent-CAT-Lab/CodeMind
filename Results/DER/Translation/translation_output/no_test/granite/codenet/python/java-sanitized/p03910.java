import java.util.Scanner;

public class p03910 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[] A = new int[N];
        int S = 0;
        int index = 0;
        for (int i = 1; i <= N; i++) {
            if (S >= N) {
                break;
            }
            S += i;
            A[index++] = i;
        }

        int x = 0;
        for (int a : A) {
            x += a;
        }
        x -= N;
        for (int a : A) {
            if (x == a) {
                continue;
            }
            System.out.println(a);
        }
    }
}