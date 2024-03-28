import java.util.Scanner;

public class p02450 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i + 1;
        }
        permutation(array, 0, n - 1);
    }

    private static void permutation(int[] array, int i, int n) {
        if (i == n) {
            for (int j = 0; j <= n; j++) {
                System.out.print(array[j] + " ");
            }
            System.out.println();
        } else {
            for (int j = i; j <= n; j++) {
                swap(array, i, j);
                permutation(array, i + 1, n);
                swap(array, i, j);
            }
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}