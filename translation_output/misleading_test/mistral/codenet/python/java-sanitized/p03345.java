import java.util.Scanner;

public class p03345 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int K = scanner.nextInt();
        int result = 0;
        if ((K & 1) == 0) {
            result = A - B;
        } else {
            result = B - A;
        }
        System.out.println(result);
    }
}