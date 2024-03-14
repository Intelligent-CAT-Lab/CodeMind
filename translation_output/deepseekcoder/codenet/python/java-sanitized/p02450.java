import java.util.Scanner;

public class p02450 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 1; i <= n; i++) {
            array[i - 1] = i;
        }
        permutation(array, 0, n - 1);
    }

    private static void permutation(int[] array, int left, int right) {
        if (left == right) {
            for (int i = 0; i <= right; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        } else {
            for (int i = left; i <= right; i++) {
                swap(array, left, i);
                permutation(array, left + 1, right);
                swap(array, left, i);
            }
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}