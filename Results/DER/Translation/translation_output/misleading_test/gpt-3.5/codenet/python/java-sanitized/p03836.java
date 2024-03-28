import java.util.Scanner;

public class p03836 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sx = sc.nextInt();
        int sy = sc.nextInt();
        int tx = sc.nextInt();
        int ty = sc.nextInt();

        StringBuilder order = new StringBuilder();
        int x = tx - sx;
        int y = ty - sy;

        order.append("L");
        order.append("U".repeat(y+1));
        order.append("R".repeat(x+1));
        order.append("D");

        order.append("R");
        order.append("D".repeat(y+1));
        order.append("L".repeat(x+1));
        order.append("U");

        order.append("U".repeat(y));
        order.append("R".repeat(x));
        order.append("D".repeat(y));
        order.append("L".repeat(x));

        System.out.println(order.toString());
    }
}