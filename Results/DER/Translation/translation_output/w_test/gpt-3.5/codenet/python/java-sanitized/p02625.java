import java.util.Scanner;

public class p02625 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        long[] d = new long[n + 1];
        for (int i = 0; i < n; i++) {
            d[i + 1] = ((m - i) * ((m - n + i) * d[i] + i * d[i - 1] * (m - i + 1))) % (int) (1e9 + 7);
        }
        System.out.println(d[n]);
    }
}