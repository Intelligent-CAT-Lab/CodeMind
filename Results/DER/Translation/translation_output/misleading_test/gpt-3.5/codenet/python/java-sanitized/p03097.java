import java.util.Scanner;

public class p03097 {
    
    static int popCount(int x) {
        int res = 0;
        for (int i = 0; i < 17; i++) {
            res += (x >> i) % 2 == 1 ? 1 : 0;
        }
        return res;
    }

    static int[] f(int m, int x, int y) {
        if (m == 1) {
            if (x == 0) {
                return new int[]{0, 1};
            } else {
                return new int[]{1, 0};
            }
        }

        int res[] = {x};
        int diff = 0;
        for (int i = 0; i < m; i++) {
            if (((x >> i) % 2) != ((y >> i) % 2)) {
                diff = i;
                break;
            }
        }

        int s = (x % (1 << diff)) + ((((x / (1 << (diff + 1))) * (1 << (diff + 1))) >> 1);
        int t = (y % (1 << diff)) + ((((y / (1 << (diff + 1))) * (1 << (diff + 1))) >> 1);
        int u = s ^ 1;

        int[] left = f(m - 1, s, u);
        int[] right = f(m - 1, u, t);

        int xBit = (x >> diff) % 2;
        int yBit = (y >> diff) % 2;

        for (int i = 0; i < left.length; i++) {
            left[i] = left[i] % (1 << diff) + (1 << diff) * xBit + ((((left[i] / (1 << diff)) * (1 << diff)) << 1);
        }

        for (int i = 0; i < right.length; i++) {
            right[i] = right[i] % (1 << diff) + (1 << diff) * yBit + ((((right[i] / (1 << diff)) * (1 << diff)) << 1);
        }

        int[] result = new int[left.length + right.length];
        System.arraycopy(left, 0, result, 0, left.length);
        System.arraycopy(right, 0, result, left.length, right.length);

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        if (popCount(a ^ b) % 2 == 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
            int[] result = f(n, a, b);
            for (int num : result) {
                System.out.print(num + " ");
            }
        }
    }
}