import java.util.Scanner;

public class p03836 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sx, sy, tx, ty;
        sx = sc.nextInt();
        sy = sc.nextInt();
        tx = sc.nextInt();
        ty = sc.nextInt();
        int x = tx - sx;
        int y = ty - sy;
        String order = "L";
        order += "U" + (y + 1);
        order += "R" + (x + 1);
        order += "D";
        order += "R";
        order += "D" + (y + 1);
        order += "L" + (x + 1);
        order += "U";
        order += "U" + y;
        order += "R" + x;
        order += "D" + y;
        order += "L" + x;
        System.out.println(order);
    }
}