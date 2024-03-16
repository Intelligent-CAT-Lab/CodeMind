<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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


Translate the above java code to python.

python code:

[/INST]
```python
import sys

s = sys.stdin.readline().strip()
last = [-1] * 26
for i, ch in enumerate(s):
    ch = ord(ch) - ord('a')
    if last[ch] >= 0 and i - last[ch] < 3:
        print(last[ch] + 1, i + 1)
        break
    last[ch] = i
else:
    print(-1, -1)
```
This code uses the `ord` function to convert the characters to their ASCII values, and then uses the `enumerate` function to iterate over the characters in the string. It also uses the `break` statement to exit the loop when a match is found.

The `last` array is initialized with -1 to indicate that no character has been seen yet. For each character in the string, the code checks if the last occurrence of that character was less than 3 characters ago. If it was, it prints the indices of the last occurrence and the current character, and then exits the loop using the `break` statement. If no match is found, the code prints -1 -1 at the end.</s>
