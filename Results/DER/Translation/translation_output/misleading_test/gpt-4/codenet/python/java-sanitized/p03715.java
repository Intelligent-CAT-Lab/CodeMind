import java.util.Scanner;

public class p03715 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        scanner.close();
        
        if (h % 3 == 0 || w % 3 == 0) {
            System.out.println(0);
            return;
        }
        
        int res = Math.min(h, w);
        for (int hi = 1; hi < h; hi++) {
            int b1 = hi * w;
            int b2 = (h - hi) * (w / 2);
            int b3 = (h - hi) * (w / 2 + w % 2);
            int maxB = Math.max(Math.max(b1, b2), b3);
            int minB = Math.min(Math.min(b1, b2), b3);
            res = Math.min(res, maxB - minB);
        }
        for (int wi = 1; wi < w; wi++) {
            int b1 = wi * h;
            int b2 = (w - wi) * (h / 2);
            int b3 = (w - wi) * (h / 2 + h % 2);
            int maxB = Math.max(Math.max(b1, b2), b3);
            int minB = Math.min(Math.min(b1, b2), b3);
            res = Math.min(res, maxB - minB);
        }
        
        System.out.println(res);
    }
}