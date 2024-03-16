import java.util.Scanner;

public class p02995 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int lcm = c * d / gcd(c, d);

        int ans = main(a, b, c, d, lcm);
        System.out.println(ans);
    }

    private static int main(int a, int b, int c, int d, int lcm) {
        return b - a + 1 - (b / c - (a - 1) / c + b / d - (a - 1) / d - (b / lcm - (a - 1) / lcm));
    }

    private static int gcd(int a, int b) {
        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}