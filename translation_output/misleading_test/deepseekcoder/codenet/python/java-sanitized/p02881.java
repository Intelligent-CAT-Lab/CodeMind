import java.util.Scanner;

public class p02881 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(sumIJ(n) - 2);
    }

    private static int sumIJ(int n) {
        int i = (int) Math.sqrt(n);
        while (i > 0) {
            if (n / i == n / i) {
                return i + n / i;
            }
            i--;
        }
        return 0;
    }
}