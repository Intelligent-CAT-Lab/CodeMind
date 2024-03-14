import java.util.Scanner;

public class p02471 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int[] result;
        if (a < b) {
            result = rec(b, a);
        } else {
            result = rec(a, b);
        }

        int dx = b / result[2];
        int dy = -a / result[2];
        if (dx < 0) {
            dx = -dx;
            dy = -dy;
        }

        int x = result[1];
        int y = result[0];
        int mag = Math.abs(x) + Math.abs(y);

        while (true) {
            int x1 = x + dx;
            int y1 = y + dy;
            int mag1 = Math.abs(x1) + Math.abs(y1);
            if (mag1 >= mag) {
                break;
            }
            mag = mag1;
            x = x1;
            y = y1;
        }

        while (true) {
            int x1 = x - dx;
            int y1 = y - dy;
            int mag1 = Math.abs(x1) + Math.abs(y1);
            if (mag1 > mag) {
                break;
            }
            mag = mag1;
            x = x1;
            y = y1;
        }

        System.out.println(x + " " + y);
    }

    private static int[] rec(int a, int b) {
        int q = a / b;
        int r = a % b;
        if (r == 0) {
            return new int[]{0, 1, b};
        }
        int[] arr = rec(b, r);
        return new int[]{arr[1], arr[0] - q * arr[1], arr[2]};
    }
}