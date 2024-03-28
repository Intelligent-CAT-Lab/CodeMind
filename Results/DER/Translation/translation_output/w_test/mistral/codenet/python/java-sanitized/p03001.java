import java.util.Scanner;

public class p03001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w, h, x, y;
        w = sc.nextInt();
        h = sc.nextInt();
        x = sc.nextInt();
        y = sc.nextInt();
        int mx = w / 2;
        int my = h / 2;
        int res[] = new int[2];
        res[0] = w * h / 2;
        if (x == mx && y == my) {
            res[1] = 1;
        } else {
            res[1] = 0;
        }
        System.out.println(res[0] + " " + res[1]);
    }
}