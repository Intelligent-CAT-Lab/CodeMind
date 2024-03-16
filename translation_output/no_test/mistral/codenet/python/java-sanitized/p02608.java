import java.util.*;

public class p02608 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> cnt = new ArrayList<>();
        for (int x = 1; x < 101; x++) {
            for (int y = 1; y < 101; y++) {
                for (int z = 1; z < 101; z++) {
                    int a = (int) Math.pow(x, 2) + (int) Math.pow(y, 2) + (int) Math.pow(z, 2) + x * y + y * z + z * x;
                    if (a <= n) {
                        cnt.add(a);
                    }
                }
            }
        }
        Map<Integer, Integer> c = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            c.put(i, cnt.get(i));
        }
        for (int i = 1; i <= n; i++) {
            System.out.println(c.get(i));
        }
    }
}