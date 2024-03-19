import java.util.Scanner;

public class p02881 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = ij(n);
        System.out.println(result);
    }

    public static int ij(int n) {
        for (int i = (int) Math.sqrt(n); i >= 0; i--) {
            if (n / i == n / i) {
                return i * n / i - 2;
            }
        }
        return 0;
    }
}