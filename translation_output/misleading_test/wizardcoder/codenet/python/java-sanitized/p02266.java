import java.util.*;

public class p02266 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int[][] g = new int[1000][2];
        g[0][0] = 0;
        for (int i = 1; i < g.length; i++) {
            char c = sc.next().charAt(0);
            cnt += c == '/'? 1 : c == '\\'? -1 : 0;
            g[i][0] = cnt;
        }
        int gmax = g[0][0];
        for (int i = 1; i < g.length; i++) {
            if (g[i - 1][0] < g[i][0] && g[i][0] > gmax) {
                g[i][1] = 1;
            }
            gmax = Math.max(gmax, g[i][0]);
        }
        List<Integer> puddles = new ArrayList<>();
        int volume = 0;
        int saface_level = -1;
        for (int i = g.length - 1; i >= 0; i--) {
            if (saface_level!= -1) {
                volume += saface_level - g[i][0];
                if (saface_level == g[i][0]) {
                    puddles.add(volume);
                    saface_level = -1;
                    volume = 0;
                }
            }
            if (saface_level == -1 && g[i][1]!= 0) {
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