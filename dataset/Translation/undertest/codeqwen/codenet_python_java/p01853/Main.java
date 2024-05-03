import java.util.Scanner;

public class p01853 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        String[] points = new String[n];
        for (int i = n / 2 + 1; i < n; i++) {
            points[i] = String.valueOf(m);
        }

        for (String point : points) {
            System.out.print(point + " ");
        }
    }
}