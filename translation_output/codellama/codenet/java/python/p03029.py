<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class p03029 {
    public static void main(String[] args){
        try {

        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        String str[] = (br.readLine()).split("\\s+");
        int A = Integer.parseInt(str[0]);
        int P = Integer.parseInt(str[1]);
        System.out.println((P+3*A)/2);

        } catch(IOException e) {
            System.out.println("Exception :" + e);
        }

    }
}

Translate the above java code to python.

python code:

[/INST]
```python
import sys

def main():
    try:
        A, P = map(int, sys.stdin.readline().split())
        print((P + 3 * A) // 2)
    except ValueError:
        print("Exception:", sys.exc_info()[0])

if __name__ == "__main__":
    main()
```
This is the equivalent Python code for the given Java code. The `map` function is used to convert the input string to integers, and the `//` operator is used for integer division. The `sys.stdin.readline()` function is used to read a line from the standard input, and the `split()` method is used to split the line into two integers. The `sys.exc_info()` function is used to get the exception information in case of an error.</s>
