import java.util.*;

public class p03713 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int ans = (int) Math.pow(10, 10);
        if (h % 3 == 0 || w % 3 == 0) {
            ans = 0;
        } else {
            if (h % 3 == 1) {
                int Sa = h / 3 * w;
                int Sb = h / 3 * w;
                int Sc = (h / 3 + 1) * w;
                int dif = Math.max(Sa, Sb, Sc) - Math.min(Sa, Sb, Sc);
                ans = Math.min(ans, dif);
            } else if (h % 3 == 2) {
                int Sa = h / 3 * w;
                int Sb = (h / 3 + 1) * w;
                int Sc = (h / 3 + 1) * w;
                int dif = Math.max(Sa, Sb, Sc) - Math.min(Sa, Sb, Sc);
                ans = Math.min(ans, dif);
            }
            if (w % 3 == 1) {
                int Sa = w / 3 * h;
                int Sb = w / 3 * h;
                int Sc = (w / 3 + 1) * h;
                int dif = Math.max(Sa, Sb, Sc) - Math.min(Sa, Sb, Sc);
                ans = Math.min(ans, dif);
            } else if (w % 3 == 2) {
                int Sa = w / 3 * h;
                int Sb = (w / 3 + 1) * h;
                int Sc = (w / 3 + 1) * h;
                int dif = Math.max(Sa, Sb, Sc) - Math.min(Sa, Sb, Sc);
                ans = Math.min(ans, dif);
            }
            if (h % 2 == 0) {
                for (int i = 1; i < w; i++) {
                    int Sa = h / 2 * i;
                    int Sc = h * (w - i);
                    int dif = Math.abs(Sa - Sc);
                    ans = Math.min(ans, dif);
                }
            } else if (h % 2 == 1) {
                for (int i = 1; i < w; i++) {
                    int Sa = h / 2 * i;
                    int Sb = (h / 2 + 1) * i;
                    int Sc = h * (w - i);
                    int dif = Math.max(Sa, Sb, Sc) - Math.min(Sa, Sb, Sc);
                    ans = Math.min(ans, dif);
                }
            }
            if (w % 2 == 0) {
                for (int j = 1; j < h; j++) {
                    int Sa = w / 2 * j;
                    int Sc = w * (h - j);
                    int dif = Math.abs(Sa - Sc);
                    ans = Math.min(ans, dif);
                }
            } else if (w % 2 == 1) {
                for (int j = 1; j < h; j++) {
                    int Sa = w / 2 * j;
                    int Sb = (w / 2 + 1) * j;
                    int Sc = w * (h - j);
                    int dif = Math.max(Sa, Sb, Sc) - Math.min(Sa, Sb, Sc);
                    ans = Math.min(ans, dif);
                }
            }
        }
        System.out.println(ans);
    }
}