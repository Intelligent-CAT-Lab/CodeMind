<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
needed

Expected output:
2

```
import java.util.Arrays;
import java.util.Scanner;

public class p04026 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    char[] s = scanner.next().toCharArray();
    int[] last = new int[26];
    Arrays.fill(last, -1);
    for (int i = 0; i < s.length; i++) {
      int ch = s[i] - 'a';
      if (last[ch] >= 0 && i - last[ch] < 3) {
        System.out.printf("%d %d\n", last[ch] + 1, i + 1);
        return;
      }
      last[ch] = i;
    }
    System.out.println("-1 -1");
  }
}

```

### Response:
```python
def find_duplicates(s):
    last = [-1]*26
    for i, ch in enumerate(s):
        ch = ord(ch) - ord('a')
        if last[ch] >= 0 and i - last[ch] < 3:
            return last[ch] + 1, i + 1
        last[ch] = i
    return -1, -1

s = input()
start, end = find_duplicates(s)
print(start, end)
```

In this Python code, we define a function `find_duplicates` that takes a string `s` as input. It initializes a list `last` of size 26 with all elements set to -1. Then it iterates over the string `s`. For each character in the string, it calculates its corresponding index in the `last` list by subtracting the ASCII value of 'a' from the ASCII value of the character. If the character is found in the string within the last three characters, it returns the indices of the first and the current character. If no such character is found after iterating over the entire string, it returns -1, -1. The input string is read from the standard input, and the result is printed to the standard output.
<|EOT|>
