<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1234567876

Expected output:
34


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

### Response:
```python
def min_difference(S):
    min_diff = 1000
    for i in range(len(S) - 2):
        X = int(S[i:i + 3])
        min_diff = min(min_diff, abs(X - 753))
    return min_diff

S = input()
print(min_difference(S))
```

In this Python code, we define a function `min_difference` that takes a string `S` as input and returns the minimum difference between any three-digit number in `S` and 753. The function iterates over all possible three-digit numbers in `S`, calculates the absolute difference with 753, and updates the minimum difference if the current difference is smaller. The main part of the code reads a string from the standard input and prints the result of the `min_difference` function.
<|EOT|>
