import java.util.*;

public class p02012 {
    static int mod = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int[] lis = new int[s];
        Arrays.fill(lis, 1);
        for (int i = 2; i <= s; i++) {
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    lis[i] = Math.max(lis[i], lis[j]);
                }
            }
        }
        Map<Integer, Integer> f = new HashMap<>();
        Map<Integer, Integer> p = new HashMap<>();
        for (int i = 1; i <= s; i++) {
            for (int j = 1; j <= i; j++) {
                int sum = (i + j) * (i - j + 1) >> 1;
                if (p.containsKey(new int[]{i, j})) {
                    f.put(sum, f.get(sum) + 1);
                    p.put(new int[]{i, j}, 0);
                }
            }
            for (int j = 1; j <= s - i; j++) {
                int sum = (i + j) * (s - i + j) >> 1;
                if (p.containsKey(new int[]{i, j})) {
                    f.put(sum, f.get(sum) + 1);
                    p.put(new int[]{i, j}, 0);
                }
            }
        }
        int ans = 0;
        for (int i = 1; i <= s; i++) {
            ans += f.get(i) * f.get(s / i);
        }
        System.out.println(ans);
    }
}