import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class p03711 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        List<Integer> a = Arrays.asList(1, 3, 5, 7, 8, 10, 12);
        List<Integer> b = Arrays.asList(4, 6, 9, 11);

        if (x == 2 || y == 2) {
            System.out.println("No");
        } else if (a.contains(x) && a.contains(y) || b.contains(x) && b.contains(y)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}