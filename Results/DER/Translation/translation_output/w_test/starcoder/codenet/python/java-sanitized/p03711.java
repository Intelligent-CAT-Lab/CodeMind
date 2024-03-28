import java.util.*;
public class p03711 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x == 2 || y == 2) {
            System.out.println("No");
        } else if (x == 1 || x == 3 || x == 5 || x == 7 || x == 8 || x == 10 || x == 12 || y == 4 || y == 6 || y == 9 || y == 11) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}