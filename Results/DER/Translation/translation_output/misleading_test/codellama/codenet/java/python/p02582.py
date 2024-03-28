<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
RRS

Expected output:
-27

```
import java.io.*;

public class p02582 {

    public static void main(String[] args) throws IOException {
        PrintWriter prnt = new PrintWriter(System.out);
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String s = read.readLine();
        int res = 0;
        if (s.charAt(0) == 'R' && s.charAt(1) == 'R' && s.charAt(2) == 'R') {
            res = 3;
        } else if (s.charAt(0) == 'R' && s.charAt(1) == 'R') {
            res = 2;
        } else if (s.charAt(1) == 'R' && s.charAt(2) == 'R') {
            res = 2;
        } else if (s.charAt(0) == 'S' && s.charAt(1) == 'S' && s.charAt(2) == 'S') {
            res = 0;
        } else {
            res = 1;
        }

        prnt.println(res);
        prnt.close();
    }
}
```
[/INST]
```python
import sys

def main():
    input_string = sys.stdin.readline().strip()
    result = 0
    if input_string == "RRS":
        result = 3
    elif input_string == "RR":
        result = 2
    elif input_string == "SSS":
        result = 0
    else:
        result = 1
    print(result)

if __name__ == "__main__":
    main()
```
Note: The `sys` module is used to read input from stdin and write output to stdout. The `strip()` method is used to remove any leading or trailing whitespace from the input string. The `if` statement is used to check the input string and set the result accordingly. The `print()` function is used to output the result.</s>
