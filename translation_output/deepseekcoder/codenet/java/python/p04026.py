<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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
import sys

def main():
    s = input()
    last = [-1]*26
    for i, ch in enumerate(s):
        ch = ord(ch) - ord('a')
        if last[ch] >= 0 and i - last[ch] < 3:
            print(last[ch], i)
            sys.exit(0)
        last[ch] = i
    print(-1, -1)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the input, then iterates over the string. For each character, it checks if the last occurrence of that character was within the last three characters. If it is, it prints the indices of the last occurrence and the current character and exits. If it isn't, it updates the last occurrence of the character. If it goes through the entire string without finding a character that meets the condition, it prints -1 -1.
<|EOT|>
