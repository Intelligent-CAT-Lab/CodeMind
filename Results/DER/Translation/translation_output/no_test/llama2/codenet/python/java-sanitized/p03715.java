import java.util.Scanner;

public class p03715 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        if (h % 3 == 0 || w % 3 == 0) {
            System.out.println(0);
            return;
        }
        int res = Math.min(h, w);
        for (int hi = 1; hi < h; hi++) {
            int b1 = hi * w;
            int b2 = (h - hi) * (w / 2);
            int b3 = (h - hi) * (w / 2 + w % 2);
            res = Math.min(res, Math.max(b1, b2, b3) - Math.min(b1, b2, b3));
        }
        for (int wi = 1; wi < w; wi++) {
            int b1 = wi * h;
            int b2 = (w - wi) * (h / 2);
            int b3 = (w - wi) * (h / 2 + h % 2);
            res = Math.min(res, Math.max(b1, b2, b3) - Math.min(b1, b2, b3));
        }
        System.out.println(res);
    }
}