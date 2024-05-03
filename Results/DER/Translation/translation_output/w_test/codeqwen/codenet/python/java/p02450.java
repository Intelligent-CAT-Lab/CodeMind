Here is the Java equivalent of your Python code:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
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
```

This Java program uses recursion to generate all permutations of the input array. The `permute` function is the recursive function that generates permutations. It swaps the elements at indices `l` and `i`, then recursively calls itself with `l + 1` and `r`. After the recursive call, it swaps the elements back to restore the original array. The `swap` function is a helper function that swaps two elements in an array. The `main` function reads the input from the user, creates an array with the input size, and calls the `permute` function to generate and print all permutations.
