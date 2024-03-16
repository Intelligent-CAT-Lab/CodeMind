import java.util.Scanner;

public class p03666 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = new int[5];
        for (int i = 0; i < 5; i++) {
            input[i] = scanner.nextInt();
        }
        scanner.close();

        int N = input[0];
        int A = input[1];
        int B = input[2];
        int C = input[3];
        int D = input[4];

        for (int k = 0; k <= N; k++) {
            int j = N - 1 - k;
            if (D * k - C * j >= B - A && C * k - D * j <= B - A) {
                System.out.println("YES");
                break;
            }
        }
        System.out.println("NO");
    }
}