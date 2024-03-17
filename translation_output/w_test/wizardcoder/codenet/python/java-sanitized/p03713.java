import java.util.*;

public class p03713 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int ans = 1000000000;
        if (h % 3 == 0 || w % 3 == 0) {
            ans = 0;
        } else {
            if (h % 3 == 1) {
                int Sa = (int) Math.ceil(h / 3.0) * w;
                int Sb = (int) Math.ceil(h / 3.0) * w;
                int Sc = (int) Math.ceil((h + 1) / 3.0) * w;
                int dif = Math.max(Sa, Sb, Sc) - Math.min(Sa, Sb, Sc);
                ans = Math.min(ans, dif);
            } else if (h % 3 == 2) {
                int Sa = (int) Math.ceil(h / 3.0) * w;
                int Sb = (int) Math.ceil((h + 1) / 3.0) * w;
                int Sc = (int) Math.ceil((h + 1) / 3.0) * w;
                int dif = Math.max(Sa, Sb, Sc) - Math.min(Sa, Sb, Sc);
                ans = Math.min(ans, dif);
            }
            if (w % 3 == 1) {
                int Sa = (int) Math.ceil(w / 3.0) * h;
                int Sb = (int) Math.ceil(w / 3.0) * h;
                int Sc = (int) Math.ceil((w + 1) / 3.0) * h;
                int dif = Math.max(Sa, Sb, Sc) - Math.min(Sa, Sb, Sc);
                ans = Math.min(ans, dif);
            } else if (w % 3 == 2) {
                int Sa = (int) Math.ceil(w / 3.0) * h;
                int Sb = (int) Math.ceil((w + 1) / 3.0) * h;
                int Sc = (int) Math.ceil((w + 1) / 3.0) * h;
                int dif = Math.max(Sa, Sb, Sc) - Math.min(Sa, Sb, Sc);
                ans = Math.min(ans, dif);
            }
            if (h % 2 == 0) {
                for (int i = 1; i < w; i++) {
                    int Sa = (int) Math.ceil(h / 2.0) * i;
                    int Sc = h * (w - i);
                    int dif = Math.abs(Sa - Sc);
                    ans = Math.min(ans, dif);
                }
            } else if (h % 2 == 1) {
                for (int i = 1; i < w; i++) {
                    int Sa = (int) Math.ceil(h / 2.0) * i;
                    int Sb = (int) Math.ceil((h + 1) / 2.0) * i;
                    int Sc = h * (w - i);
                    int dif = Math.max(Sa, Sb, Sc) - Math.min(Sa, Sb, Sc);
                    ans = Math.min(ans, dif);
                }
            }
            if (w % 2 == 0) {
                for (int j = 1; j < h; j++) {
                    int Sa = (int) Math.ceil(w / 2.0) * j;
                    int Sc = w * (h - j);
                    int dif = Math.abs(Sa - Sc);
                    ans = Math.min(ans, dif);
                }
            } else if (w % 2 == 1) {
                for (int j = 1; j < h; j++) {
                    int Sa = (int) Math.ceil(w / 2.0) * j;
                    int Sb = (int) Math.ceil((w + 1) / 2.0) * j;
                    int Sc = w * (h - j);
                    int dif = Math.max(Sa, Sb, Sc) - Math.min(Sa, Sb, Sc);
                    ans = Math.min(ans, dif);
                }
            }
        }
        System.out.println(ans);
    }
}