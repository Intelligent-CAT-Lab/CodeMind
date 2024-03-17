import java.util.Scanner;
import java.lang.Math;

public class p02696 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int N = scanner.nextInt();
        scanner.close();

        System.out.println((int)Math.floor(A * Math.min(B - 1, N) / B));
    }
}