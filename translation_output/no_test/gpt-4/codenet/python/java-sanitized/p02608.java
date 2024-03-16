import java.util.HashMap;
import java.util.Scanner;

public class p02608 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        HashMap<Integer, Integer> counter = new HashMap<>();

        for (int x = 1; x <= 100; x++) {
            for (int y = 1; y <= 100; y++) {
                for (int z = 1; z <= 100; z++) {
                    int a = x * x + y * y + z * z + x * y + y * z + z * x;
                    if (a <= n) {
                        if (!counter.containsKey(a)) {
                            counter.put(a, 0);
                        }
                        counter.put(a, counter.get(a) + 1);
                    }
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            if (counter.containsKey(i)) {
                System.out.println(counter.get(i));
            } else {
                System.out.println(0);
            }
        }

        scanner.close();
    }
}