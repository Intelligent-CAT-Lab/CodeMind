import java.util.Scanner;

public class p02957 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        double x = (Math.pow(A, 2) - Math.pow(B, 2)) / (2 * (A - B));
        if (x % 1 == 0) {
            System.out.println((int) x);
        } else {
            System.out.println("IMPOSSIBLE");
        }
    }
}