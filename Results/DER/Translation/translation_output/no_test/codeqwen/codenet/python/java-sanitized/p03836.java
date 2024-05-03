import java.util.Scanner;

public class p03836 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int sx = Integer.parseInt(inputs[0]);
        int sy = Integer.parseInt(inputs[1]);
        int tx = Integer.parseInt(inputs[2]);
        int ty = Integer.parseInt(inputs[3]);

        int x = tx - sx;
        int y = ty - sy;

        StringBuilder order = new StringBuilder();

        for (int i = 0; i <= y; i++) {
            order.append("U");
        }
        for (int i = 0; i <= x; i++) {
            order.append("R");
        }
        for (int i = 0; i <= y; i++) {
            order.append("D");
        }
        for (int i = 0; i <= x; i++) {
            order.append("L");
        }

        order.append("U");
        order.append("R");
        order.append("D");
        order.append("L");

        for (int i = 0; i <= y; i++) {
            order.append("U");
        }
        for (int i = 0; i <= x; i++) {
            order.append("R");
        }
        for (int i = 0; i <= y; i++) {
            order.append("D");
        }
        for (int i = 0; i <= x; i++) {
            order.append("L");
        }

        System.out.println(order.toString());
    }
}