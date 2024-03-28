import java.util.Scanner;

public class atcoder_AGC006_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int x = scanner.nextInt();
        if (x == 1 || x == 2 * N - 1) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
            int[] l = new int[2 * N];
            for (int i = 1; i <= 2 * N; i++) {
                l[i - 1] = i;
            }
            l[x - 1] = 0;
            l[x] = 0;
            l[x + 1] = 0;
            for (int i = 0; i < N - 2; i++) {
                System.out.println(l[i]);
            }
            System.out.println(x - 1);
            System.out.println(x);
            System.out.println(x + 1);
            for (int i = 0; i < N - 2; i++) {
                System.out.println(l[N - 2 + i]);
            }
        }
    }
}