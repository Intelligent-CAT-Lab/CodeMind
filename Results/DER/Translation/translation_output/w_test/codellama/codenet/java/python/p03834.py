<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
happy,newyear,enjoy

Expected output:
happy newyear enjoy


```
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

```
[/INST]
```
import sys

with open(sys.stdin, 'r') as f:
    s = f.readline()

print(s.replace(',', ' '))
```
This code reads a line of input from the standard input stream (stdin) using the `readline()` method of the `BufferedReader` class. It then replaces all occurrences of the comma character (`,`) with a space character (` `) using the `replace()` method of the `str` class. Finally, it prints the resulting string to the standard output stream (stdout) using the `print()` function.

Note that the `with` statement is used to open the file in a context manager, which ensures that the file is properly closed when the code block is exited.</s>
