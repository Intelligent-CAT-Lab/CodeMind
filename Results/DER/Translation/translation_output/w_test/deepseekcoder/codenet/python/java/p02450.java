<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2

Expected output:
1 2
2 1


```
from itertools import permutations
for p in list(permutations(range(1, int(input())+1))): print(*p)

```

### Response:
Here is the Java equivalent of the given Python code:

```java
import java.util.Scanner;

public class Main {
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
```

This Java program generates all permutations of a given number. It uses a recursive function `permutation()` to generate the permutations. The `swap()` function is used to swap the elements of the array. The `main()` function reads the input number and generates an array of numbers from 1 to the input number. The `permutation()` function is then called with the generated array and the indices 0 and the input number minus 1.
<|EOT|>
