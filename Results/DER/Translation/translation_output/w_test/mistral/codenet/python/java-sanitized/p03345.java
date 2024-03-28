import java.util.Scanner;

public class p03345 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int K = scanner.nextInt();
        if ((K & 1) == 0) {
            System.out.println(A - B);
        } else {
            System.out.println(B - A);
        }
    }
}