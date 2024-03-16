import java.util.Scanner;

public class p03097 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (popCount(a ^ b) % 2 == 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
            f(n, a, b);
        }
    }

    public static int popCount(int x) {
        int res = 0;
        for (int i = 0; i < 17; i++) {
            res += ((x >> i) % 2 == 1) ? 1 : 0;
        }
        return res;
    }

    public static void f(int m, int x, int y) {
        if (m == 1) {
            if (x == 0) {
                System.out.println("0 1");
            } else {
                System.out.println("1 0");
                
            }
            return;
        }

        int diff = 0;
        for (int i = 0; i < m; i++) {
            if ((x >> i) % 2 != (y >> i) % 2) {
                diff = i;
                break;
            }
        }

        int s = (x % (1 << diff)) + (((x / (1 << (diff + 1))) * (1 << (diff + 1))) >> 1;
        int t = (y % (1 << diff)) + (((y / (1 << (diff + 1))) * (1 << (diff + 1))) >> 1;

        int u = s ^ 1;
        f(m - 1, s, u);
        f(m - 1, u, t);
    }
}