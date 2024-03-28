import java.util.Scanner;

public class p02738 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int M = sc.nextInt();
        int l = n * 3 + 1;
        int[][] d = new int[l][n * 5];
        d[0][0] = 1;
        for (int i = 1; i < l; i++) {
            int j = i - 1;
            int k = i - 2;
            d[i] = ((d[i - 3] * k + roll(d[k], -1)) * j + roll(d[j], 1)) % M;
        }
        System.out.println(sum(d[-1][:l]) % M);
    }

    public static int roll(int[] arr, int n) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[(i + n) % arr.length] = arr[i];
        }
        return result;
    }

    public static int sum(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        return result;
    }
}