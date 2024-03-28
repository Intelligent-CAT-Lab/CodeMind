import java.util.Scanner;

public class p02696 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A, B, N;
        A = scanner.nextInt();
        B = scanner.nextInt();
        N = scanner.nextInt();
        int result = (int) Math.floor(A * Math.min(B - 1, N) / B);
        System.out.println(result);
    }
}