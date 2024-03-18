import java.util.Scanner;

public class p02881 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(sum(ij((int)Math.sqrt(n))) - 2);
        scanner.close();
    }

    static int[] ij(int x) {
        for (int i = x; i > 0; i--) {
            if (n / i == n / (double) i) {
                return new int[]{i, n / i};
            }
        }
        return null;  // This line will never be reached with the current logic.
    }

    static int sum(int[] array) {
        return array[0] + array[1];
    }
}