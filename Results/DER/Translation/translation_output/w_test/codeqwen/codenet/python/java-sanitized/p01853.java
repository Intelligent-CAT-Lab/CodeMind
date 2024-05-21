import java.util.Scanner;

public class p01853 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        String[] points = new String[n];

        for (int i = n / 2 + 1; i < n; i++) {
            points[i] = String.valueOf(m);
        }

        for (String point : points) {
            System.out.print(point + " ");
        }
    }
}