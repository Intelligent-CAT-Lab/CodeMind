import java.util.Scanner;

public class p02696 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int N = scanner.nextInt();
        scanner.close();

        double result = A * Math.min(B - 1, N) / (double) B;
        System.out.println((int) Math.floor(result));
    }
}