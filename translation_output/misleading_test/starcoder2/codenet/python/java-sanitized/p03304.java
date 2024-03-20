import java.util.Scanner;

public class p03304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        if (d > 0) {
            System.out.println(2 * (n - d) * (m - 1) / n * n);
        } else {
            System.out.println((m - 1) / n);
        }
    }
}