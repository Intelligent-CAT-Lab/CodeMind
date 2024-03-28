<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

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
[/INST]

Here is the Python code that translates the Java code:
```python
import sys

def is_palindrome(s):
    # Check if the string is a palindrome
    # by comparing the first half of the string
    # with the second half of the string
    for i in range(len(s) // 2):
        if s[i] != s[-i-1]:
            return False
    return True

def main():
    # Read the input string from stdin
    s = sys.stdin.readline().strip()

    # Check if the string is a palindrome
    if is_palindrome(s):
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()
```
This code uses the `sys` module to read the input string from stdin, and the `strip()` method to remove any trailing newline characters. The `is_palindrome()` function checks if the string is a palindrome by comparing the first half of the string with the second half of the string. If the two halves are the same, the function returns `True`, otherwise it returns `False`. The `main()` function calls the `is_palindrome()` function to check if the input string is a palindrome, and prints "Yes" or "No" accordingly.</s>
