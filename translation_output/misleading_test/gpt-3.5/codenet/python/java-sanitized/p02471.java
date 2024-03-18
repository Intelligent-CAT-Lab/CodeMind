import java.util.Scanner;

public class p02471 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int[] result = rec(a, b);

        System.out.println(result[0] + " " + result[1]);
    }

    public static int[] rec(int a, int b) {
        if (a < b) {
            int[] temp = rec(b, a);
            return new int[]{temp[1], temp[0]};
        }

        int q, r;
        q = a / b;
        r = a % b;

        if (r == 0) {
            return new int[]{0, 1};
        }

        int[] temp = rec(b, r);
        int x = temp[1];
        int y = temp[0] - q * temp[1];

        return new int[]{x, y};
    }
}