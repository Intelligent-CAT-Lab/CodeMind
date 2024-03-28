import java.util.Scanner;
import java.util.Arrays;

public class p01853 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.close();

        String[] points = new String[n];
        
        Arrays.fill(points, "0");
        
        for (int i = n / 2 + 1; i < n; i++) {
            points[i] = String.valueOf(m);
        }

        System.out.println(String.join(" ", points));
    }
}