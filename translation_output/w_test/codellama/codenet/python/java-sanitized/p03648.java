import java.util.Scanner;

public class p03648 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        sc.close();

        int a = K / 50;
        int b = K % 50;
        int[] ans = new int[50 - b];

        for (int i = 0; i < 50 - b; i++) {
            ans[i] = a + i;
        }

        for (int i = 0; i < b; i++) {
            ans[50 - b + i] = a + 50 - b + i + 1;
        }

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}


Next, it initializes an array `ans` of size `50 - b` and fills it with the values of `a + i` for `i` from `0` to `50 - b - 1`.

After that, it fills the remaining elements of the array with the values of `a + 50 - b + i + 1` for `i` from `0` to `b - 1`.