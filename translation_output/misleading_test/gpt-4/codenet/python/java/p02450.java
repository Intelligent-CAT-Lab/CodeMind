Certainly! Below is the Python code translated into Java. It performs permutations of numbers from 1 to the input number n and prints them out.

```java
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Permutations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        // Create a list of numbers to permute
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            numbers.add(i);
        }

        // Generate permutations and print them
        permutations(numbers, 0);
    }

    private static void permutations(List<Integer> numbers, int index) {
        if (index == numbers.size() - 1) {
            printList(numbers);
        }
        for (int i = index; i < numbers.size(); i++) {
            Collections.swap(numbers, i, index);
            permutations(numbers, index + 1);
            Collections.swap(numbers, i, index);  // backtrack
        }
    }

    private static void printList(List<Integer> numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
```

Test this code with your provided test case by running the Java program and providing input `2`. It should produce the expected output:

```
1 2
2 1
```
