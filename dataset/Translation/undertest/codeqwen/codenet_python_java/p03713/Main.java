import java.util.Scanner;

public class p03713 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();

        int ans = 1000000000;
        if ((h % 3 == 0) || (w % 3 == 0)) {
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
                int dif = Math.max(Sa, Sb