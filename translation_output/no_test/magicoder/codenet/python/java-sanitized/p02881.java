import java.util.Scanner;

public class p02881 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int[] result = ij(n);
        System.out.println(result[0] + result[1] - 2);
    }

    public static int[] ij(int x) {
        for (int i = x; i > 0; i--) {
            if (x / i == x / i) {
                return new int[]{i, x / i};
            }
        }
        return new int[]{0, 0};
    }
}