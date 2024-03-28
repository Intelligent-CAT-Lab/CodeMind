<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
needed

Expected output:
2 5


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

@@ Response
```python
def find_duplicate(s):
    last = [-1] * 26
    for i in range(len(s)):
        ch = ord(s[i]) - ord('a')
        if last[ch] >= 0 and i - last[ch] < 3:
            return last[ch] + 1, i + 1
        last[ch] = i
    return -1, -1

s = input()
print(*find_duplicate(s))
```

In this Python code, we define a function `find_duplicate` that takes a string `s` as input. We initialize a list `last` of size 26 with all elements as -1. Then we iterate over the string `s`. For each character in the string, we find its ASCII value and subtract the ASCII value of 'a' to get the index of the character in the list `last`. If the value at the index is not -1 and the difference between the current index and the value at the index is less than 3, we return the pair of indices (last[ch] + 1, i + 1). If no such pair is found, we return -1, -1.

Finally, we take the input string `s`, call the function `find_duplicate` with `s` as argument, and print the result.<｜end▁of▁sentence｜>
