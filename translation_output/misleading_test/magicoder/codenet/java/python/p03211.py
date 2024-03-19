<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1234567876

Expected output:
110

```
import java.util.Scanner;

public class p03211 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int min = 1000;
        for (int i = 0; i < S.length() - 2; i++) {
            int X = Integer.parseInt(S.substring(i, i + 3));
            min = Math.min(min, Math.abs(X - 753));
        }
        System.out.println(min);
        sc.close();
    }
}
```

@@ Response
```python
def min_difference(S):
    min_diff = 1000
    for i in range(len(S) - 2):
        X = int(S[i:i+3])
        min_diff = min(min_diff, abs(X - 753))
    return min_diff

S = input()
print(min_difference(S))
```

This Python code does the same thing as the Java code. It reads a string of digits from the user, then iterates over all possible triplets of digits in the string. For each triplet, it calculates the absolute difference between the triplet and 753, and updates the minimum difference found so far. Finally, it prints the minimum difference.<｜end▁of▁sentence｜>
