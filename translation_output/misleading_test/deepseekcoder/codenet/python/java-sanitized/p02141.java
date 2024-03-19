import java.util.Scanner;

public class p02141 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int W = scanner.nextInt();
        int H = scanner.nextInt();
        int w = scanner.nextInt();
        int h = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        double a = Math.min(W/2.0 , x + w/2.0) + Math.max(-W/2.0, x-w/2.0);
        double b = Math.min(H/2.0 , y + h/2.0) + Math.max(-H/2.0, y-h/2.0);
        System.out.println(b/a);
    }
}