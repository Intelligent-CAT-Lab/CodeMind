import java.util.Arrays;
import java.util.Scanner;

public class p02450 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        permute(arr, 0, n - 1);
    }

    static void permute(int[] arr, int l, int r) {
        if (l == r) {
            System.out.println(Arrays.toString(arr).replace("[", "").replace("]", "").replace(" ", ""));
        } else {
            for (int i = l; i <= r; i++) {
                swap(arr, l, i);
                permute(arr, l + 1, r);
                swap(arr, l, i);
            }
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}