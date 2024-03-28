<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
Here is the Java equivalent of the given Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        permute(list, 0, n - 1);
    }

    static void permute(List<Integer> list, int l, int r) {
        if (l == r) {
            System.out.println(list.toString().replace("[", "").replace("]", "").replace(", ", " "));
        } else {
            for (int i = l; i <= r; i++) {
                Collections.swap(list, l, i);
                permute(list, l + 1, r);
                Collections.swap(list, l, i);
            }
        }
    }
}
```

This Java code does the same thing as the Python code. It generates all permutations of a list of numbers from 1 to n, where n is the input number. The `permute` function is a recursive function that swaps the elements at different positions and then calls itself with the next position. When the position is equal to the size of the list, it prints the list.<｜end▁of▁sentence｜>
