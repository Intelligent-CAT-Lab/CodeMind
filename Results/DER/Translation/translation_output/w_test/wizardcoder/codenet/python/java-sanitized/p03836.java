import java.util.Scanner;

public class p03836 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sx = sc.nextInt();
        int sy = sc.nextInt();
        int tx = sc.nextInt();
        int ty = sc.nextInt();
        int x = tx - sx;
        int y = ty - sy;
        String order = "";
        order += "U" + (y+1) + "R" + (x+1) + "D";
        order += "R" + "D" + (y+1) + "L" + (x+1) + "U";
        order += "U" + y + "R" + x + "D" + y + "L" + x;
        System.out.println(order);
    }
}