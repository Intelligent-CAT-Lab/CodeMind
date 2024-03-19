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
        g = new int[n][2];
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < s.length(); j++) {
                g[i][0] += dirs[s.charAt(j) - '_'] * 2;
            }
        }
        int max = g[0][0];
        for (int i = 1; i < n; i++) {
            if (g[i - 1][0] < g[i][0] && g[i][0] <= max) {
                g[i][1] = true;
            }
            max = Math.max(max, g[i][0]);
        }
        puddles = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            if (saface_level != 0) {
                volume += saface_level - g[i][0];
                if (saface_level == g[i][0]) {
                    puddles[i] = volume;
                    saface_level = 0;
                    volume = 0;
                }
            }
            if (saface_level == 0 && g[i][1]) {
                saface_level = g[i][0];
            }
        }
        Arrays.sort(puddles);
        System.out.println(Arrays.stream(puddles).sum());
        System.out.println(puddles.length + " " + Arrays.toString(puddles));
    }
}