import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class p02608 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] cnt = new int[101 * 101 * 101];

        for (int x = 1; x <= 100; x++) {
            for (int y = 1; y <= 100; y++) {
                for (int z = 1; z <= 100; z++) {
                    int a = x * x + y * y + z * z + x * y + y * z + z * x;
                    if (a <= n) {
                        cnt[a]++;
                    }
                }
            }
        }

        Map<Integer, Integer> c = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            c.put(i, 0);
        }

        for (int count : cnt) {
            if (count > 0) {
                c.put(count, c.get(count) + 1);
            }
        }

        for (int i = 1; i <= n; i++) {
            System.out.println(c.get(i));
        }
    }
}