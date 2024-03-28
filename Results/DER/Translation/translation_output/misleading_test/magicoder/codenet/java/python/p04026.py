<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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
start, end = find_duplicate(s)
print(start, end)
```

In this Python code, we define a function `find_duplicate` that takes a string `s` as input. It initializes a list `last` of size 26 with all elements as -1. Then it iterates over the string `s`. For each character in the string, it calculates its ASCII value and subtracts the ASCII value of 'a' to get the index of the character in the list `last`. If the character is already in the string and the distance between the current position and the last occurrence is less than 3, it returns the positions of the last occurrence and the current position. If the character is not in the string or the distance is greater than or equal to 3, it updates the last occurrence of the character. If no duplicate is found, it returns -1, -1.

The main part of the code takes a string input from the user, calls the `find_duplicate` function with the input string, and prints the result.<｜end▁of▁sentence｜>
