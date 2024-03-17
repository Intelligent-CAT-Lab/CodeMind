<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
akasaka

Expected output:
Yes


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

def run():
    s = sys.stdin.readline().strip()
    arr = list(s)

    for i in range(len(s)//2):
        if arr[i] != arr[len(s)-1-i]:
            print("No")
            return

    for i in range(len(s)//2-1):
        if arr[i] != arr[(len(s)//2)-1-i]:
            print("No")
            return

    print("Yes")

if __name__ == "__main__":
    run()
```

This Python code reads a string from the standard input, checks if it is a palindrome by comparing the characters at the beginning and end of the string, and then moving inward. If it finds a pair of characters that do not match, it prints "No" and returns. If it completes the loop without finding a mismatch, it prints "Yes".
<|EOT|>
