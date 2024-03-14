import java.util.Scanner;

public class p03836 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sx = scanner.nextInt();
        int sy = scanner.nextInt();
        int tx = scanner.nextInt();
        int ty = scanner.nextInt();

        StringBuilder order = new StringBuilder();

        int x = tx - sx;
        int y = ty - sy;

        for (int i = 0; i < y; i++) {
            order.append("U");
        }
        for (int i = 0; i < x; i++) {
            order.append("R");
        }
        order.append("D");

        for (int i = 0; i < y; i++) {
            order.append("D");
        }
        for (int i = 0; i < x; i++) {
            order.append("L");
        }
        order.append("U");

        for (int i = 0; i < y; i++) {
            order.append("U");
        }
        for (int i = 0; i < x; i++) {
            order.append("R");
        }
        order.append("D");

        for (int i = 0; i < y; i++) {
            order.append("D");
        }
        for (int i = 0; i < x; i++) {
            order.append("L");
        }
        order.append("U");

        System.out.println(order.toString());
    }
}