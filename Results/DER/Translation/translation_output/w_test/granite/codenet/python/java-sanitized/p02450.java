import java.util.Arrays;

public class p02450 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        permutations(arr, 0, n - 1);
    }

    public static void permutations(int[] arr, int l, int r) {
        if (l == r) {
            System.out.println(Arrays.toString(arr));
        } else {
            for (int i = l; i <= r; i++) {
                int temp = arr[l];
                arr[l] = arr[i];
                arr[i] = temp;
                permutations(arr, l + 1, r);
                temp = arr[l];
                arr[l] = arr[i];
                arr[i] = temp;
            }
        }
    }
}