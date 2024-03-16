import java.util.Scanner;

public class atcoder_AGC006_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, x;
        N = sc.nextInt();
        x = sc.nextInt();
        if (x == 1 || x == 2 * N - 1) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
            int[] l = new int[N];
            for (int i = 0; i < N; i++) {
                l[i] = sc.nextInt();
            }
            l[0] = x - 1;
            l[N - 1] = x + 1;
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