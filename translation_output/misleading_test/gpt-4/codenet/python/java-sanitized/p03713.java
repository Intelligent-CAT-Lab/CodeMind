import java.util.Scanner;

public class p03713 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        scanner.close();

        long ans = (long)Math.pow(10, 10);
        if (h % 3 == 0 || w % 3 == 0) {
            ans = 0;
        } else {
            if (h % 3 == 1) {
                long Sa = (h / 3) * w;
                long Sb = Sa;
                long Sc = (h / 3 + 1) * w;
                long dif = Math.max(Math.max(Sa, Sb), Sc) - Math.min(Math.min(Sa, Sb), Sc);
                ans = Math.min(ans, dif);
            } else if (h % 3 == 2) {
                long Sa = (h / 3) * w;
                long Sb = (h / 3 + 1) * w;
                long Sc = Sb;
                long dif = Math.max(Math.max(Sa, Sb), Sc) - Math.min(Math.min(Sa, Sb), Sc);
                ans = Math.min(ans, dif);
            }

            if (w % 3 == 1) {
                long Sa = (w / 3) * h;
                long Sb = Sa;
                long Sc = (w / 3 + 1) * h;
                long dif = Math.max(Math.max(Sa, Sb), Sc) - Math.min(Math.min(Sa, Sb), Sc);
                ans = Math.min(ans, dif);
            } else if (w % 3 == 2) {
                long Sa = (w / 3) * h;
                long Sb = (w / 3 + 1) * h;
                long Sc = Sb;
                long dif = Math.max(Math.max(Sa, Sb), Sc) - Math.min(Math.min(Sa, Sb), Sc);
                ans = Math.min(ans, dif);
            }

            if (h % 2 == 0) {
                for (int i = 1; i < w; i++) {
                    long Sa = (h / 2) * i;
                    long Sc = h * (w - i);
                    long dif = Math.abs(Sa - Sc);
                    ans = Math.min(ans, dif);
                }
            } else if (h % 2 == 1) {
                for (int i = 1; i < w; i++) {
                    long Sa = (h / 2) * i;
                    long Sb = (h / 2 + 1) * i;
                    long Sc = h * (w - i);
                    long dif = Math.max(Math.max(Sa, Sb), Sc) - Math.min(Math.min(Sa, Sb), Sc);
                    ans = Math.min(ans, dif);
                }
            }

            if (w % 2 == 0) {
                for (int j = 1; j < h; j++) {
                    long Sa = (w / 2) * j;
                    long Sc = w * (h - j);
                    long dif = Math.abs(Sa - Sc);
                    ans = Math.min(ans, dif);
                }
            } else if (w % 2 == 1) {
                for (int j = 1; j < h; j++) {
                    long Sa = (w / 2) * j;
                    long Sb = (w / 2 + 1) * j;
                    long Sc = w * (h - j);
                    long dif = Math.max(Math.max(Sa, Sb), Sc) - Math.min(Math.min(Sa, Sb), Sc);
                    ans = Math.min(ans, dif);
                }
            }
        }
        System.out.println(ans);
    }
}