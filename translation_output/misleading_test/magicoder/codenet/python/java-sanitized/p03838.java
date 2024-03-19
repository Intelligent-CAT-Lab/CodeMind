import java.util.Scanner;

public class p03838 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int absX = Math.abs(x);
        int absY = Math.abs(y);

        if (0 <= x && x < y) {
            System.out.println(y - x);
            return;
        }
        if (0 < y && y < x) {
            System.out.println(x - y + 2);
            return;
        }
        if (y == 0 && 0 < x) {
            System.out.println(x + 1);
            return;
        }

        if (x < y && y <= 0) {
            System.out.println(y - x);
            return;
        }
        if (y < x && x < 0) {
            System.out.println(x - y + 2);
            return;
        }
        if (x == 0 && y < 0) {
            System.out.println(Math.abs(absY) + 1);
            return;
        }

        if (x < 0 && 0 < y) {
            System.out.println(Math.abs(absY - absX) + 1);
            return;
        }
        if (y < 0 && 0 < x) {
            System.out.println(Math.abs(absY - absX) + 1);
            return;
        }
    }
}