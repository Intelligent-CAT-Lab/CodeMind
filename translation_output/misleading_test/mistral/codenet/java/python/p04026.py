<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
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
[/INST]
```python
import sys

s = sys.stdin.readline().strip()
last = [-1] * 26
for i, char in enumerate(s):
    ch = ord(char) - ord('a')
    if last[ch] >= 0 and i - last[ch] < 3:
        print(last[ch] + 1, i + 1)
        return
    last[ch] = i
print("-1 -1")
```</s>
