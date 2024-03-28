import java.util.Scanner;

public class p02266 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int cnt = 0;
        int[] g = new int[s.length() + 1];
        boolean[] b = new boolean[s.length() + 1];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '_') {
                cnt += 0;
            } else if (c == '/') {
                cnt += 1;
            } else if (c == '\\') {
                cnt -= 1;
            }
            g[i + 1] = cnt;
        }
        int gmax = g[0];
        for (int i = 1; i < g.length; i++) {
            if (g[i - 1] < g[i] && g[i] <= gmax) {
                b[i] = true;
            }
            gmax = Math.max(gmax, g[i]);
        }
        int[] puddles = new int[s.length()];
        int volume = 0;
        int saface_level = -1;
        for (int i = g.length - 1; i >= 0; i--) {
            if (saface_level != -1) {
                volume += saface_level - g[i];
                if (saface_level == g[i]) {
                    puddles[i] = volume;
                    saface_level = -1;
                    volume = 0;
                }
            }
            if (saface_level == -1 && b[i]) {
                saface_level = g[i];
            }
        }
        int sum = 0;
        for (int i = 0; i < puddles.length; i++) {
            sum += puddles[i];
        }
        System.out.println(sum);
        int count = 0;
        for (int i = 0; i < puddles.length; i++) {
            if (puddles[i] != 0) {
                count++;
            }
        }
        System.out.print(count);
        for (int i = 0; i < puddles.length; i++) {
            if (puddles[i] != 0) {
                System.out.print(" " + puddles[i]);
            }
        }
    }
}