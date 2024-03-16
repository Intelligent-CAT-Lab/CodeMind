<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.io.*;

class p02256 {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);

        System.out.println(GCD(a, b));
    }

    public static int GCD (int a, int b) {
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (a % b == 0) return b;
        else return GCD (b, a%b);
    }
}

Translate the above java code to python.

python code:

[/INST]
```python
import sys

def gcd(a, b):
    if a < b:
        a, b = b, a
    if a % b == 0:
        return b
    else:
        return gcd(b, a % b)

if __name__ == "__main__":
    a, b = map(int, sys.stdin.readline().split())
    print(gcd(a, b))
```
This is the equivalent Python code for the given Java code. The `gcd` function is defined in the same way as in the Java code, with the only difference being that the `if` statements are indented to match the Python syntax. The `if __name__ == "__main__":` block is used to run the code only when the file is executed as a script, rather than when it is imported as a module. The `map` function is used to convert the input string to a list of integers, and the `sys.stdin.readline()` function is used to read a line of input from the standard input stream.</s>
