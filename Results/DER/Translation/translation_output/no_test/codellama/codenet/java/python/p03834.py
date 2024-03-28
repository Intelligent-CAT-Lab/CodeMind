<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p03834 {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            final String s = reader.readLine();

            System.out.println(s.replace(",", " "));
        }
    }
}


Translate the above java code to python.

python code:

[/INST]
```python
import sys

with open(sys.stdin, "r") as f:
    line = f.readline()
    print(line.replace(",", " "))
```
This code reads a line from the standard input (stdin) and replaces all occurrences of `,` with a space. The resulting string is then printed to the standard output (stdout).

Note that the `with` statement is used to open the file in read mode and automatically close it when the block of code is finished. This is a more Pythonic way of handling file I/O compared to the Java code.</s>
