import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class p02450 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = scanner.nextInt();

        // Create a list with numbers from 1 to n
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++) {
            numbers.add(i);
        }

        // Generate and print all permutations
        do {
            for (Integer num : numbers) {
                System.out.print(num + " ");
            }
            System.out.println();
        } while (nextPermutation(numbers));
    }

    // Next Permutation algorithm to generate permutations in lexicographic order
    public static boolean nextPermutation(ArrayList<Integer> array) {
        // Find the longest non-increasing suffix and find the pivot
        int i = array.size() - 1;
        while (i > 0 && array.get(i - 1) >= array.get(i)) {
            i--;
        }
        if (i <= 0) {
            return false;
        }

        // Find rightmost element that exceeds the pivot
        int j = array.size() - 1;
        while (array.get(j) <= array.get(i - 1)) {
            j--;
        }

        // Swap the pivot with the rightmost element
        Collections.swap(array, i - 1, j);

        // Reverse the suffix
        j = array.size() - 1;
        while (i < j) {
            Collections.swap(array, i, j);
            i++;
            j--;
        }

        return true;
    }
}