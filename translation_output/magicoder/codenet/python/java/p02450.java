<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
from itertools import permutations
for p in list(permutations(range(1, int(input())+1))): print(*p)

```

@@ Response
Here is the equivalent Java code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            numbers.add(i);
        }

        permute(numbers, 0, numbers.size() - 1);
    }

    private static void permute(List<Integer> numbers, int l, int r) {
        if (l == r) {
            System.out.println(numbers);
        } else {
            for (int i = l; i <= r; i++) {
                Collections.swap(numbers, l, i);
                permute(numbers, l + 1, r);
                Collections.swap(numbers, l, i);
            }
        }
    }
}
```

This Java code does the same thing as the Python code. It generates all permutations of a list of numbers from 1 to n, where n is the input number. The `permute` function is a recursive function that generates all permutations of a list of numbers. It swaps the elements at the current index and all the elements after it, then recursively generates all permutations of the remaining elements. When it reaches the end of the list, it prints the current permutation.<｜end▁of▁sentence｜>
