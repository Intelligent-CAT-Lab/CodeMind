import java.util.Scanner;

public class p03874 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = 512;
        int pattern = 0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = factorial(7 + i) / factorial(i) / factorial(7);
        }
        a = reverse(a);

        int cnt = 600 * 7;
        String[] ans = new String[n];
        for (int i = 0; i < n; i++) {
            ans[i] = "FESTIVA";
            ans[i] += "L".repeat(k / a[i]);
            k %= a[i];
        }
        ans = reverse(ans);
        System.out.println(String.join("", ans));
    }

    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static int[] reverse(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length - i - 1];
        }
        return result;
    }

    public static String[] reverse(String[] arr) {
        String[] result = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length - i - 1];
        }
        return result;
    }
}