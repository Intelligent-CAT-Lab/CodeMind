Here is the Python code translated to Java, which iterates through all permutations of numbers from 1 to `n` where `n` is provided by the user input:

```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Permutations {
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
```

To use the code above, run the Java application, and input an integer when prompted. The application will display all permutations of the numbers from 1 to the entered integer. Note that this implementation includes its own permutation generator since Java's standard library does not have a permutation function equivalent to Python's `itertools.permutations`.
