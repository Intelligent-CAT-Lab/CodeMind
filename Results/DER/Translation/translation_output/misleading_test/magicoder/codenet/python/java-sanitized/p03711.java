import java.util.Arrays;
import java.util.Scanner;

public class p03711 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int[] a = {1, 3, 5, 7, 8, 10, 12};
        int[] b = {4, 6, 9, 11};
        if (x == 2 || y == 2) {
            System.out.println("No");
        } else if (Arrays.asList(a).contains(x) && Arrays.asList(a).contains(y) || Arrays.asList(b).contains(x) && Arrays.asList(b).contains(y)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}