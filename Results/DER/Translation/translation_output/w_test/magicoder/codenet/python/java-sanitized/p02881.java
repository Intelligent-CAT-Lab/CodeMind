import java.util.Scanner;

public class p02881 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int result = ij(n, (int) Math.sqrt(n));
        System.out.println(result);
    }

    public static int ij(int n, int x) {
        for (int i = x; i > 0; i--) {
            if (n / i == n / i) {
                return i + n / i - 2;
            }
        }
        return 0;
    }
}