
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    int n, a, b;
    ArrayList<Integer> ans;

    void run() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();

        if (Integer.bitCount(a^b) % 2 == 0) {
            System.out.println("NO");
            return;
        }
        System.out.println("YES");
        ans = new ArrayList<>();

        solve(a, b, (1 << n) - 1);

        boolean check = true;
        for (int i = 0; i < (1 << n) - 1; i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println(b);
    }

    void reverse(int[] ar, int l, int r) {
        int c = (l + r) / 2 - l;
        for (int i = 0; i < c; i++) {
            int tmp = ar[l + i];
            ar[l + i] = ar[r - i];
            ar[r - i] = tmp;
        }
    }

    void solve(int A, int B, int mask) {
//        debug(Integer.toBinaryString(A), Integer.toBinaryString(B), mask);

        if (Integer.bitCount(mask) == 1) {
            ans.add(A);
            ans.add(B);
            return;
        }

        int div = -1;
        for (int i = 0; i < n; i++) if ((((A ^ B) & mask) & (1 << i)) > 0) {
            div = i;
        }
        mask ^= 1 << div;

        int c = mask & (-mask);

        int C = A ^ c;
        solve(A, C, mask);
        solve(C^ (1 << div), B, mask);
    }

    void debug(Object...os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
