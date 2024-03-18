import java.util.HashMap;
import java.util.Scanner;

public class p02608 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        HashMap<Integer, Integer> cnt = new HashMap<>();

        for (int x = 1; x <= 100; x++) {
            for (int y = 1; y <= 100; y++) {
                for (int z = 1; z <= 100; z++) {
                    int a = x * x + y * y + z * z + x * y + y * z + z * x;
                    if (a <= n) {
                        cnt.put(a, cnt.getOrDefault(a, 0) + 1);
                    }
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            System.out.println(cnt.getOrDefault(i, 0));
        }

        scanner.close();
    }
}