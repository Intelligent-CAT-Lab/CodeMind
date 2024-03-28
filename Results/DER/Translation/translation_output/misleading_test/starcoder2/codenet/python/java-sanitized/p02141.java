import java.util.Scanner;

public class p02141 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int H = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        double a = (Math.min(W/2, x + w/2) + Math.max(-W/2, x-w/2));
        double b = (Math.min(H/2, y + h/2) + Math.max(-H/2, y-h/2));
        System.out.println(b/a);
    }
}