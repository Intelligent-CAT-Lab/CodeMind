<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
Here is the equivalent Python code:

```python
def run():
    s = input()
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

run()
```

This Python code does the same thing as the Java code. It reads a string from the user, converts it to a list of characters, and then checks if the first half of the string is the same as the second half (ignoring the middle character if the string length is odd). If it is, it prints "Yes"; otherwise, it prints "No".<｜end▁of▁sentence｜>
