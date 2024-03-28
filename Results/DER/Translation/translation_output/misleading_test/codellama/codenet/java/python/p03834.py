<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
happy,newyear,enjoy

Expected output:
ha$ppy ntwHea= eXnjoy

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

def main():
    s = sys.stdin.readline().strip()
    print(s.replace(",", " "))

if __name__ == "__main__":
    main()
```
This code reads a line of input from the standard input stream using the `sys.stdin.readline()` method, and then replaces all occurrences of the comma character (`,`) with a space character (` `) using the `str.replace()` method. Finally, it prints the resulting string to the standard output stream using the `print()` function.

Note that the `strip()` method is used to remove any leading or trailing whitespace from the input string, which is not necessary in this case but is a good practice to follow.</s>
