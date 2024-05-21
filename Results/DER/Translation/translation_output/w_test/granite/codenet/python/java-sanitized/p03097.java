import java.util.*;

public class p03097 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] res = solve(n, a, b);
        if (res == null) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
            for (int i = 0; i < n; i++) {
                System.out.print(res[i] + " ");
            }
        }
    }

    public static int[] solve(int n, int a, int b) {
        int xor = a ^ b;
        int popCount = 0;
        for (int i = 0; i < 32; i++) {
            if ((xor & (1 << i))!= 0) {
                popCount++;
            }
        }
        if (popCount % 2 == 0) {
            return null;
        }
        int[] res = new int[n];
        int[] left = solve(n - 1, a, a ^ b);
        if (left == null) {
            return null;
        }
        for (int i = 0; i < n - 1; i++) {
            res[i] = left[i];
        }
        res[n - 1] = a ^ b;
        return res;
    }
}