import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class p02450 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        int[] numbers = new int[number];
        for (int i = 0; i < number; i++) {
            numbers[i] = i + 1;
        }

        List<List<Integer>> permutations = generatePermutations(numbers);
        for (List<Integer> permutation : permutations) {
            for (int i = 0; i < permutation.size(); i++) {
                System.out.print(permutation.get(i) + " ");
            }
            System.out.println();
        }
    }

    private static List<List<Integer>> generatePermutations(int[] numbers) {
        List<List<Integer>> permutations = new ArrayList<>();
        permute(numbers, 0, permutations);
        return permutations;
    }

    private static void permute(int[] arr, int k, List<List<Integer>> permutations) {
        if (k == arr.length) {
            List<Integer> currentPermutation = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                currentPermutation.add(arr[i]);
            }
            permutations.add(currentPermutation);
        } else {
            for (int i = k; i < arr.length; i++) {
                swap(arr, i, k);
                permute(arr, k + 1, permutations);
                swap(arr, i, k); // backtrack
            }
        }
    }

    private static void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}