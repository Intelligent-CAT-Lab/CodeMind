import java.util.Scanner;

public class p00333 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int W = scanner.nextInt();
        int H = scanner.nextInt();
        int C = scanner.nextInt();
        scanner.close();
        
        int g = gcd(W, H);
        int result = W * H * C / (g * g);
        System.out.println(result);
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}