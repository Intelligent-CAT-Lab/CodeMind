import java.util.Scanner;

public class p03836 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sx = scanner.nextInt();
        int sy = scanner.nextInt();
        int tx = scanner.nextInt();
        int ty = scanner.nextInt();

        int x = tx - sx;
        int y = ty - sy;

        String order = "L";

        order += "U";
        for (int i = 1; i <= y; i++) {
            order += "U";
        }
        order += "R";
        for (int i = 1; i <= x; i++) {
            order += "R";
        }
        order += "D";

        order += "R";
        order += "D";
        for (int i = 1; i <= y; i++) {
            order += "D";
        }
        order += "L";
        for (int i = 1; i <= x; i++) {
            order += "L";
        }
        order += "U";

        order += "U";
        for (int i = 0; i < y; i++) {
            order += "U";
        }
        order += "R";
        for (int i = 0; i < x; i++) {
            order += "R";
        }
        order += "D";
        for (int i = 0; i < y; i++) {
            order += "D";
        }
        order += "L";
        for (int i = 0; i < x; i++) {
            order += "L";
        }

        System.out.println(order);
    }
}