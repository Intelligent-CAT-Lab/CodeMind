<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
from itertools import permutations
for p in list(permutations(range(1, int(input())+1))): print(*p)

```

### Response:
Here is the Java equivalent of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
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
```

This Java code does the same thing as your Python code. It generates all permutations of a list of numbers from 1 to n. The `permutation` method is a recursive function that generates the permutations. It swaps each element in the list with the first element, then recursively generates the permutations of the rest of the list. After each recursive call, it swaps the elements back to restore the original list.
<|EOT|>
