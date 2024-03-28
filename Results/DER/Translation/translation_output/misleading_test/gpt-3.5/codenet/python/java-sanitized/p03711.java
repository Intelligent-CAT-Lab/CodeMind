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
        } else if ((inArray(x, a) && inArray(y, a)) || (inArray(x, b) && inArray(y, b))) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean inArray(int num, int[] arr) {
        for (int i : arr) {
            if (num == i) {
                return true;
            }
        }
        return false;
    }
}