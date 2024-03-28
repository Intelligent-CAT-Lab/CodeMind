import java.util.Scanner;

public class p02470 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            p[i] = i;
        }
        for (int i = 2; i <= n; i++) {
            if (p[i] == i) {
                for (int j = i; j <= n; j += i) {
                    p[j] = p[j] / i * (i - 1);
                }
            }
        }
        System.out.println(p[n]);
    }
}