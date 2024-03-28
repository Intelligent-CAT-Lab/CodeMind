import java.util.Scanner;

public class p03836 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sx, sy, tx, ty;
        sx = scanner.nextInt();
        sy = scanner.nextInt();
        tx = scanner.nextInt();
        ty = scanner.nextInt();
        int x = tx - sx;
        int y = ty - sy;
        String order = "L";
        order += "U".repeat(y + 1);
        order += "R".repeat(x + 1);
        order += "D";
        order += "R".repeat(y + 1);
        order += "D".repeat(y + 1);
        order += "L".repeat(x + 1);
        order += "U".repeat(y);
        order += "R".repeat(x);
        order += "D".repeat(y);
        order += "L".repeat(x);
        System.out.println(order);
    }
}