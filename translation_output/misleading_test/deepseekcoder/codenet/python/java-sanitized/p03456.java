import java.util.Scanner;

public class p03456 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = a * 10 + b;
        int sqrtn = (int) Math.sqrt(n);
        boolean isPerfectSquare = false;
        for (int i = 1; i <= sqrtn; i++) {
            if (i * i == n) {
                isPerfectSquare = true;
                break;
            }
        }
        System.out.println(isPerfectSquare ? "Yes" : "No");
    }
}