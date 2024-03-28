import java.util.*;

public class p02608 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] cnt = new int[n + 1];
        for (int x = 1; x <= 100; x++) {
            for (int y = 1; y <= 100; y++) {
                for (int z = 1; z <= 100; z++) {
                    int a = (int) (Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2) + x * y + y * z + z * x);
                    if (a <= n) {
                        cnt[a]++;
                    }
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            System.out.println(cnt[i]);
        }
    }
}