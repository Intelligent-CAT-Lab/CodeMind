import java.util.*;

public class p02608 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> cnt = new ArrayList<>();
        for (int x = 1; x <= 100; x++) {
            for (int y = 1; y <= 100; y++) {
                for (int z = 1; z <= 100; z++) {
                    int a = (int) (Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2) + x * y + y * z + z * x);
                    if (a <= n) {
                        cnt.add(a);
                    }
                }
            }
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : cnt) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int i = 1; i <= n; i++) {
            System.out.println(map.getOrDefault(i, 0));
        }
    }
}