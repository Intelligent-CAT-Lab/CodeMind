import java.util.Scanner;

public class p00378 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A, B, X;
        String[] input = scanner.nextLine().split(" ");
        A = Integer.parseInt(input[0]);
        B = Integer.parseInt(input[1]);
        X = Integer.parseInt(input[2]);
        int k = (X / 1000);
        int ans = k * Math.min(A, 2 * B);
        int r = X - 1000 * k;
        if (0 < r && r <= 500) {
            ans += Math.min(A, B);
        } else if (500 < r) {
            ans += Math.min(A, 2 * B);
        }
        System.out.println(ans);
    }
}