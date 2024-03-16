<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p03534 {
    public void main(Scanner sc) {
        String str = sc.next();
        int abc[] = new int[3];
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < 3; j++) {
                if (str.charAt(i) == "abc".charAt(j)) {
                    abc[j]++;
                }
            }
        }

        Arrays.sort(abc);

        System.out.println(((abc[1] - abc[0] < 2) && (abc[2] - abc[0] < 2)) ? "YES" : "NO");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new p03534().main(sc);
        sc.close();
    }
}

```

### Response:
```python
import sys

class p03534:
    def __init__(self):
        self.abc = [0, 0, 0]

    def main(self, sc):
        str = sc.next()
        for i in range(len(str)):
            for j in range(3):
                if str[i] == "abc"[j]:
                    self.abc[j] += 1

        self.abc.sort()

        print("YES" if (self.abc[1] - self.abc[0] < 2) and (self.abc[2] - self.abc[0] < 2) else "NO")

if __name__ == "__main__":
    sc = sys.stdin
    p03534().main(sc)
    sc.close()
```

This Python code does the same thing as the Java code. It reads a string from standard input, counts the number of 'a', 'b', and 'c' characters in the string, sorts the counts, and then prints "YES" if the counts of 'b' and 'c' are within 1 of each other and the counts of 'a' and 'c' are within 1 of each other, and "NO" otherwise.
<|EOT|>
