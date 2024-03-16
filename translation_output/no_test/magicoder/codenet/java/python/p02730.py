<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
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

This Python code does the same thing as the Java code. It reads a string from the standard input, checks if it's a palindrome, and prints "Yes" if it is and "No" if it isn't.<｜end▁of▁sentence｜>
