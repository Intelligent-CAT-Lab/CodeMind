import java.util.*;

public class p02266 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            char c = sc.next().charAt(0);
            arr[i] = c == '/'? 1 : c == '\\'? -1 : 0;
        }
        int[][] g = new int[n+1][2];
        g[0][0] = 0;
        for (int i = 1; i <= n; i++) {
            g[i][0] = g[i-1][0] + arr[i-1];
            g[i][1] = g[i-1][0] < g[i][0] && g[i][0] <= g[i-1][0] + arr[i-1];
        }
        int gmax = g[0][0];
        for (int i = 1; i <= n; i++) {
            gmax = Math.max(gmax, g[i][0]);
        }
        List<Integer> puddles = new ArrayList<>();
        int volume = 0;
        int saface_level = 0;
        for (int i = n; i >= 1; i--) {
            if (saface_level!= 0) {
                volume += saface_level - g[i][0];
                if (saface_level == g[i][0]) {
                    puddles.add(volume);
                    saface_level = 0;
                    volume = 0;
                }
            }
            if (saface_level == 0 && g[i][1]) {
                saface_level = g[i][0];
            }
        }
        int sum = 0;
        for (int p : puddles) {
            sum += p;
        }
        System.out.println(sum);
        System.out.println(puddles.size());
        for (int p : puddles) {
            System.out.print(p + " ");
        }
    }
}