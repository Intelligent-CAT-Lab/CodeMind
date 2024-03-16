import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class p02974 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int mod = 1000000007;

        List<List<List<Integer>>> dp = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            List<List<Integer>> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                List<Integer> col = new ArrayList<>();
                for (int l = 0; l <= k + 2 * (j + 1); l++) {
                    col.add(0);
                }
                row.add(col);
            }
            dp.add(row);
        }

        dp.get(0).get(0).set(0, 1);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                for (int l = 0; l <= k + 2 * (j + 1); l++) {
                    dp.get(i + 1).get(j + 1).set(l + 2 * (j + 1), (dp.get(i).get(j).get(l) + dp.get(i + 1).get(j + 1).get(l)) % mod);
                    dp.get(i + 1).get(j).set(l + 2 * j, (dp.get(i).get(j).get(l) * (j * 2 + 1)) % mod);
                    if (j != 0) {
                        dp.get(i + 1).get(j - 1).set(l + (j - 1) * 2, (dp.get(i).get(j).get(l) * j * j) % mod);
                    }
                }
            }
        }

        System.out.println(dp.get(n).get(0).get(k) % mod);
    }
}