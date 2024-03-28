<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

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
[/INST]

Here is the Python code that translates the Java code:
```python
import sys

def main():
    s = sys.stdin.readline().strip()
    arr = list(s)

    for i in range(len(s) // 2):
        if arr[i] != arr[len(s) - 1 - i]:
            print("No")
            return

    for i in range(len(s) // 2 - 1):
        if arr[i] != arr[(len(s) // 2) - 1 - i]:
            print("No")
            return

    print("Yes")

if __name__ == "__main__":
    main()
```
Note that the Python code uses the `sys` module to read input from stdin and write output to stdout, and it uses the `list` function to convert the string to a list of characters. The rest of the code is similar to the Java code, with the exception of the `return` statements, which are used to exit the function early if the string is not a palindrome.</s>
