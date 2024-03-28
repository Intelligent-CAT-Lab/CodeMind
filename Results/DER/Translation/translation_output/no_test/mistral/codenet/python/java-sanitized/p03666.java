import java.util.Scanner;

public class p03666 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = scanner.nextLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int A = Integer.parseInt(input[1]);
        int B = Integer.parseInt(input[2]);
        int C = Integer.parseInt(input[3]);
        int D = Integer.parseInt(input[4]);

        for (int k = 1; k <= N; k++) {
            int j = N - k;
            if (D * k - C * j >= B - A >= C * k - D * j) {
                System.out.println("YES");
                break;
            }
        }
        System.out.println("NO");
    }
}