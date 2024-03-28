import java.util.*;
public class p03838 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int abs_x = Math.abs(x);
        int abs_y = Math.abs(y);
        if (x == 0 && y == 0) {
            System.out.println(0);
            return;
        }
        if (x == 0) {
            System.out.println(y + 1);
            return;
        }
        if (y == 0) {
            System.out.println(x + 1);
            return;
        }
        if (x == y) {
            System.out.println(0);
            return;
        }
        if (x < 0 && y < 0) {
            System.out.println(Math.abs(abs_y - abs_x) + 1);
            return;
        }
        if (x < 0 && y > 0) {
            System.out.println(Math.abs(abs_y - abs_x) + 1);
            return;
        }
        if (x > 0 && y < 0) {
            System.out.println(Math.abs(abs_y - abs_x) + 1);
            return;
        }
        if (x > 0 && y > 0) {
            System.out.println(Math.abs(abs_y - abs_x));
            return;
        }
    }
}