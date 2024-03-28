import java.util.Scanner;

public class p02471 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a < b) {
            int[] result = rec(b, a);
            System.out.println(result[1] + " " + result[0]);
        } else {
            int[] result = rec(a, b);
            System.out.println(result[0] + " " + result[1]);
        }
    }

    private static int[] rec(int a, int b) {
        int q = a / b;
        int r = a % b;
        if (r == 0) {
            return new int[]{0, 1, b};
        }
        int[] result = rec(b, r);
        return new int[]{result[1], result[0] - q * result[1], result[2]};
    }
}