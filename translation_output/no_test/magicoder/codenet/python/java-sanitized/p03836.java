import java.util.Scanner;

public class p03836 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int sx = Integer.parseInt(input[0]);
        int sy = Integer.parseInt(input[1]);
        int tx = Integer.parseInt(input[2]);
        int ty = Integer.parseInt(input[3]);

        int x = tx - sx;
        int y = ty - sy;

        StringBuilder order = new StringBuilder();

        order.append("L".repeat(Math.max(0, x + 1)));
        order.append("U".repeat(Math.max(0, y + 1)));
        order.append("R".repeat(Math.max(0, x + 1)));
        order.append("D".repeat(Math.max(0, y + 1)));
        order.append("R".repeat(Math.max(0, x)));
        order.append("D".repeat(Math.max(0, y)));
        order.append("L".repeat(Math.max(0, x)));
        order.append("U".repeat(Math.max(0, y)));
        order.append("U".repeat(Math.max(0, y)));
        order.append("R".repeat(Math.max(0, x)));
        order.append("D".repeat(Math.max(0, y)));
        order.append("L".repeat(Math.max(0, x)));

        System.out.println(order.toString());
    }
}