import java.util.Scanner;

public class p02881 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sqrtN = (int) Math.sqrt(n);
        int[] ij = ij(sqrtN);
        System.out.println(sum(ij[0], ij[1]) - 2);
    }

    private static int[] ij(int x) {
        for (int i = x; i > 0; i--) {
            if (n / i == n / i) {
                return new int[]{i, n / i};
            }
        }
        return new int[]{0, 0};
    }

    private static int sum(int a, int b) {
        return a + b;
    }
}