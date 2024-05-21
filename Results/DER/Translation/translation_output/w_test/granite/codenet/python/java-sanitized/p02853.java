import java.util.*;

public class p02853 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int X = 0;
        int Y = 0;

        if (x == 3) {
            X = 1000000;
        } else if (x == 2) {
            X = 2000000;
        } else if (x == 1) {
            X = 3000000;
        } else {
            X = 0;
        }

        if (y == 3) {
            Y = 1000000;
        } else if (y == 2) {
            Y = 2000000;
        } else if (y == 1) {
            Y = 3000000;
        } else {
            Y = 0;
        }

        if (x == 1 && y == 1) {
            System.out.println(X + Y + 4000000);
        } else {
            System.out.println(X + Y);
        }
    }
}