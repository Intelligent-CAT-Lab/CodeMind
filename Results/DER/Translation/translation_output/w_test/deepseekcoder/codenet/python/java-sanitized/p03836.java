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

        order.append("L".repeat(Math.max(0, x + 1)));
        order.append("U".repeat(Math.max(0, y + 1)));
        order.append("R".repeat(Math.max(0, x + 1)));
        order.append("D".repeat(Math.max(0, y + 1)));
        order.append("R".repeat(Math.max(0, x)));
        order.append("D".repeat(Math.max(0, y)));
        order.append("L".repeat(Math.max(0, x)));
        order.append("U".repeat(Math.max(0, y)));

        System.out.println(order.toString());
    }
}