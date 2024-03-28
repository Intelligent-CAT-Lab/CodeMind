import java.util.Scanner;

public class p02881 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int result = sum(ij((int) Math.sqrt(n))) - 2;
        System.out.println(result);
    }

    private static int sum(int[] ijValues) {
        return ijValues[0] + ijValues[1];
    }

    private static int[] ij(int x) {
        int i = x;
        while (i > 0) {
            if (n / i == n / i) {
                return new int[]{i, n / i};
            }
            i--;
        }
        return new int[]{0, 0}; // default return value if no solution found
    }
}