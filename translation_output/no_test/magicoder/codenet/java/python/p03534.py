<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
Here is the equivalent Python code:

```python
import sys

class p03534:
    def __init__(self):
        self.abc = [0, 0, 0]

    def main(self):
        str = sys.stdin.readline().strip()
        for i in str:
            if i == 'a':
                self.abc[0] += 1
            elif i == 'b':
                self.abc[1] += 1
            elif i == 'c':
                self.abc[2] += 1

        self.abc.sort()

        print("YES" if (self.abc[1] - self.abc[0] < 2) and (self.abc[2] - self.abc[0] < 2) else "NO")

if __name__ == "__main__":
    p03534().main()
```

This Python code does the same thing as the Java code. It reads a string from the standard input, counts the occurrences of 'a', 'b', and 'c', sorts the counts, and then prints "YES" if the difference between the second smallest and the smallest count is less than 2 and the difference between the largest and the smallest count is less than 2, otherwise it prints "NO".<｜end▁of▁sentence｜>
