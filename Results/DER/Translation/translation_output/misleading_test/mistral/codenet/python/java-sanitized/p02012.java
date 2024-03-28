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
                int sum = (i + j) * (i - j + 1);
                f.put(sum, f.getOrDefault(sum, 0) + 1);
                p.put(i, p.getOrDefault(i, 1) == 1 ? 0 : 1);
            }
        }
        int ans = 0;
        for (int i = 1; i <= s; i++) {
            for (int j = 1; j <= i; j++) {
                int sum = (i + j) * (i - j + 1);
                if (p.get(i) == 0 && p.get(j) == 0) {
                    ans += f.get(sum);
                }
            }
        }
        System.out.println(ans);
    }
}