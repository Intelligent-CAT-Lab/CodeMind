import java.util.Scanner;

public class p03836 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int sx = Integer.parseInt(input[0]);
        int sy = Integer.parseInt(input[1]);
        int tx = Integer.parseInt(input[2]);
        int ty = Integer.parseInt(input[3]);
        int x = tx - sx;
        int y = ty - sy;

        String order = "L";

        order += "U".repeat(y + 1);
        order += "R".repeat(x + 1);
        order += "D";

        order += "R";
        order += "D".repeat(y + 1);
        order += "L".repeat(x + 1);
        order += "U";

        order += "U".repeat(y);
        order += "R".repeat(x);
        order += "D".repeat(y);
        order += "L".repeat(x);

        System.out.println(order);
    }
}