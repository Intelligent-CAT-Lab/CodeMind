import java.util.Scanner;

public class p02266 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int[][] g = new int[input.length() + 1][2];
        g[0][0] = 0;
        g[0][1] = false;
        for (int i = 1; i < g.length; i++) {
            g[i][0] = func(input.charAt(i - 1));
            g[i][1] = false;
        }

        int gmax = g[0][0];
        for (int i = 1; i < g.length; i++) {
            if (g[i - 1][0] < g[i][0] && g[i][0] <= gmax) {
                g[i][1] = true;
            }
            gmax = Math.max(gmax, g[i][0]);
        }

        int[] puddles = new int[g.length - 1];
        int volume = 0;
        int safaceLevel = null;

        for (int i = g.length - 1; i >= 0; i--) {
            if (safaceLevel != null) {
                volume += safaceLevel - g[i][0];
                if (safaceLevel == g[i][0]) {
                    puddles[i] = volume;
                    safaceLevel = null;
                    volume = 0;
                }
            }
            if (safaceLevel == null && g[i][1]) {
                safaceLevel = g[i][0];
            }
        }

        int sum = 0;
        for (int i = 0; i < puddles.length; i++) {
            sum += puddles[i];
        }

        System.out.println(sum);
        System.out.println(puddles.length);
        for (int i = 0; i < puddles.length; i++) {
            System.out.print(puddles[i] + " ");
        }
    }

    public static int func(char c) {
        int cnt = 0;
        switch (c) {
            case '_':
                cnt = 0;
                break;
            case '/':
                cnt = 1;
                break;
            case '\\':
                cnt = -1;
                break;
        }
        return cnt;
    }
}