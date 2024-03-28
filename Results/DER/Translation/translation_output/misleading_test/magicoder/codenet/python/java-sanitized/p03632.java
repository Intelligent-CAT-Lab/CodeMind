import java.util.Scanner;

public class p03632 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        scanner.close();

        int ans = Math.max(0, Math.min(B, D) - Math.max(A, C));
        System.out.println(ans);
    }
}