import java.util.*;
public class p02266 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] g = new int[n + 1];
        g[0] = 0;
        for (int i = 1; i <= n; i++) {
            g[i] = g[i - 1] + (sc.next().equals("_")? 0 : (sc.next().equals("/")? 1 : -1));
        }
        int[] puddles = new int[n];
        int volume = 0;
        int saface_level = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (saface_level!= 0) {
                volume += saface_level - g[i];
                if (saface_level == g[i]) {
                    puddles[n - i - 1] = volume;
                    saface_level = 0;
                    volume = 0;
                }
            }
            if (saface_level == 0 && g[i] > 0) {
                saface_level = g[i];
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += puddles[i];
        }
        System.out.println(sum);
        System.out.println(n);
        for (int i = 0; i < n; i++) {
            System.out.print(puddles[i] + " ");
        }
    }
}