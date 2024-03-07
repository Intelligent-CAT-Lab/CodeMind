<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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


Translate the above java code to python.

python code:

[/INST]
```python
import sys

s = sys.stdin.readline().strip()
arr = list(s)

for i in range(len(s) // 2):
    if arr[i] != arr[len(s) - 1 - i]:
        print("No")
        sys.stdout.flush()
        return

for i in range(len(s) // 2 - 1):
    if arr[i] != arr[(len(s) // 2) - 1 - i]:
        print("No")
        sys.stdout.flush()
        return

print("Yes")
sys.stdout.flush()
```
This is the equivalent Python code for the given Java code. The `sys` module is used to read input from stdin and write output to stdout. The `strip()` method is used to remove any trailing whitespace from the input string. The `list()` function is used to convert the input string into a list of characters. The `range()` function is used to iterate over the indices of the list. The `len()` function is used to get the length of the list. The `//` operator is used to perform integer division and get the middle index of the list. The `print()` function is used to print the output. The `sys.stdout.flush()` function is used to flush the output buffer.</s>
