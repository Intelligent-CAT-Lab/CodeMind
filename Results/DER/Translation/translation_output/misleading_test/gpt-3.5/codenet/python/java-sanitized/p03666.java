import java.util.Scanner;

public class p03666 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int N = Integer.parseInt(inputs[0]);
        int A = Integer.parseInt(inputs[1]);
        int B = Integer.parseInt(inputs[2]);
        int C = Integer.parseInt(inputs[3]);
        int D = Integer.parseInt(inputs[4]);

        for (int k = 0; k <= N; k++) {
            int j = N - 1 - k;
            if (D * k - C * j >= B - A && B - A >= C * k - D * j) {
                System.out.println("YES");
                break;
            }
        }

        System.out.println("NO");
    }
}