import java.util.Scanner;

public class p01905 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] a = new int[M];
        for (int i = 0; i < M; i++) {
            a[i] = scanner.nextInt();
        }
        int num = N - M;
        int ans = 0;
        while (num > 0) {
            ans += 1;
            num -= 1;
        }
        System.out.println(ans - 1);
    }
}