import java.util.Scanner;

public class p01853 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        String[] points = new String[n];

        for (int i = 1; i <= n/2; i++) {
            points[i] = String.valueOf(m);
        }

        System.out.println(String.join(" ", points));
    }
}