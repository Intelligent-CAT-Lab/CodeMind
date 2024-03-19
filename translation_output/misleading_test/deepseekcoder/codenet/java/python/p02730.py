<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
akasaka

Expected output:
Y*s

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

This Python code reads a string from the standard input, checks if it is a palindrome, and prints "Yes" if it is, "No" otherwise. The code uses the `sys.stdin.readline().strip()` function to read the string from the standard input, and the `list(s)` function to convert the string to a list of characters. The `for` loops check if the first half of the string is the same as the second half (or the first half of the string is the same as the second half of the string if the string length is even). If the string is a palindrome, the code prints "Yes"; otherwise, it prints "No".
<|EOT|>
