<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.PrintWriter;
import java.util.*;

public class p02730 {

    Scanner sc = new Scanner(System.in);

    PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        new p02730().run();
    }

    void run() {

        String s = sc.next();
        char[] arr = s.toCharArray();

        for (int i=0; i<s.length()/2; i++) {
            if (arr[i]!=arr[s.length()-1-i]) {
                out.print("No");
                out.flush();
                return;
            }
        }

        for (int i=0; i<s.length()/2-1; i++) {
            if (arr[i]!=arr[(s.length()/2)-1-i]) {
                out.print("No");
                out.flush();
                return;
            }
     
        }

        out.print("Yes");
        out.flush();
    }

}

```

### Response:
```python
import sys

class p02730:

    def __init__(self):
        self.s = sys.stdin.readline().strip()

    def run(self):

        arr = list(self.s)

        for i in range(len(self.s)//2):
            if arr[i] != arr[len(self.s)-1-i]:
                print("No")
                return

        for i in range(len(self.s)//2-1):
            if arr[i] != arr[(len(self.s)//2)-1-i]:
                print("No")
                return

        print("Yes")

if __name__ == "__main__":
    p02730().run()
```

This Python code does the same thing as the Java code. It reads a string from standard input, checks if it is a palindrome, and prints "Yes" if it is, "No" otherwise. The `run` method is called if the script is run directly, not if it is imported as a module.
<|EOT|>
