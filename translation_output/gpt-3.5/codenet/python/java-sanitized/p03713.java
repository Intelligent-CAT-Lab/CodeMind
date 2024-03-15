import java.util.Scanner;

public class p03713 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();

        long ans = (long) Math.pow(10, 10);
        if (h % 3 == 0 || w % 3 == 0) {
            ans = 0;
        } else {
            if (h % 3 == 1) {
                long Sa = (long) (h / 3) * w;
                long Sb = (long) (h / 3) * w;
                long Sc = (long) ((h / 3) + 1) * w;
                long dif = Math.max(Sa, Math.max(Sb, Sc)) - Math.min(Sa, Math.min(Sb, Sc));
                ans = Math.min(ans, dif);
            } else if (h % 3 == 2) {
                long Sa = (long) (h / 3) * w;
                long Sb = (long) ((h / 3) + 1) * w;
                long Sc = (long) ((h / 3) + 1) * w;
                long dif = Math.max(Sa, Math.max(Sb, Sc)) - Math.min(Sa, Math.min(Sb, Sc));
                ans = Math.min(ans, dif);
            }

            if (w % 3 == 1) {
                long Sa = (long) (w / 3) * h;
                long Sb = (long) (w / 3) * h;
                long Sc = (long) ((w / 3) + 1) * h;
                long dif = Math.max(Sa, Math.max(Sb, Sc)) - Math.min(Sa, Math.min(Sb, Sc));
                ans = Math.min(ans, dif);
            } else if (w % 3 == 2) {
                long Sa = (long) (w / 3) * h;
                long Sb = (long) ((w / 3) + 1) * h;
                long Sc = (long) ((w / 3) + 1) * h;
                long dif = Math.max(Sa, Math.max(Sb, Sc)) - Math.min(Sa, Math.min(Sb, Sc));
                ans = Math.min(ans, dif);
            }

            if (h % 2 == 0) {
                for (int i = 1; i < w; i++) {
                    long Sa = (long) (h / 2) * i;
                    long Sc = h * (w - i);
                    long dif = Math.abs(Sa - Sc);
                    ans = Math.min(ans, dif);
                }
            } else if (h % 2 == 1) {
                for (int i = 1; i < w; i++) {
                    long Sa = (long) (h / 2) * i;
                    long Sb = (long) ((h / 2) + 1) * i;
                    long Sc = h * (w - i);
                    long dif = Math.max(Sa, Math.max(Sb, Sc)) - Math.min(Sa, Math.min(Sb, Sc));
                    ans = Math.min(ans, dif);
                }
            }

            if (w % 2 == 0) {
                for (int j = 1; j < h; j++) {
                    long Sa = (long) (w / 2) * j;
                    long Sc = w * (h - j);
                    long dif = Math.abs(Sa - Sc);
                    ans = Math.min(ans, dif);
                }
            } else if (w % 2 == 1) {
                for (int j = 1; j < h; j++) {
                    long Sa = (long) (w / 2) * j;
                    long Sb = (long) ((w / 2) + 1) * j;
                    long Sc = w * (h - j);
                    long dif = Math.max(Sa, Math.max(Sb, Sc)) - Math.min(Sa, Math.min(Sb, Sc));
                    ans = Math.min(ans, dif);
                }
            }
        }

        System.out.println(ans);
    }
}