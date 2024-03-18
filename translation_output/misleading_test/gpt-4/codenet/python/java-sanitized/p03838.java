import java.util.Scanner;

public class p03838 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        
        int abs_x = Math.abs(x);
        int abs_y = Math.abs(y);

        if (0 <= x && x < y) {
            System.out.println(y - x);
        } else if (0 < y && y < x) {
            System.out.println(x - y + 2);
        } else if (y == 0 && 0 < x) {
            System.out.println(x + 1);
        } else if (x < y && y <= 0) {
            System.out.println(y - x);
        } else if (y < x && x < 0) {
            System.out.println(x - y + 2);
        } else if (x == 0 && y < 0) {
            System.out.println(abs_y + 1);
        } else if (x < 0 && 0 < y || y < 0 && 0 < x) {
            System.out.println(Math.abs(abs_y - abs_x) + 1);
        }
        
        scanner.close();
    }
}