public class p02266 {
    static int[][] g;
    static int cnt = 0;
    static int[] dirs = {-1, 0, 1, 0};
    static int[][] puddles;
    static int volume = 0;
    static int saface_level = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        g = new int[n][n];
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < n; j++) {
                g[i][j] = s.charAt(j) == '_' ? 0 : (s.charAt(j) == '/' ? 1 : -1);
            }
        }
        for (int i = 0; i < n; i++) {
            g[i][0] = func(g[i][0]);
        }
        int gmax = g[0][0];
        for (int i = 1; i < n; i++) {
            if (g[i - 1][0] < g[i][0] <= gmax) {
                g[i][1] = true;
            }
            gmax = Math.max(gmax, g[i][0]);
        }
        puddles = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                puddles[i][j] = 0;
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            if (saface_level != 0) {
                volume += saface_level - g[i][0];
                if (saface_level == g[i][0]) {
                    puddles[i][0] = volume;
                    saface_level = 0;
                    volume = 0;
                }
            }
            if (saface_level == 0 && g[i][1]) {
                saface_level = g[i][0];
            }
        }
        puddles = puddles[::-1];
        System.out.println(volume);
        System.out.println(puddles.length + " " + Arrays.toString(puddles));
    }

    public static int func(int c) {
        global cnt += {'_': 0, '/': 1, '\\': -1}[c];
        return cnt;
    }
}