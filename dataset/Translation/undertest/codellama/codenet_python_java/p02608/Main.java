import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

public class p02608 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> cnt = new ArrayList<>();
        for (int x = 1; x <= 100; x++) {
            for (int y = 1; y <= 100; y++) {
                for (int z = 1; z <= 100; z++) {
                    int a = x * x + y * y + z * z + x * y + y * z + z * x;
                    if (a <= n) {
                        cnt.add(a);
                    }
                }
            }
        }
        Map<Integer, Integer> c = Collections.frequency(cnt);
        for (int i = 1; i <= n; i++) {
            System.out.println(c.get(i));
        }
    }
}