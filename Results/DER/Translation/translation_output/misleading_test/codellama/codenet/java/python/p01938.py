<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
AIZU

Expected output:
80

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class p01938 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] list=br.readLine().toCharArray();
        char a='A';
        int sum=0;
        for(int i=0;i<list.length;i++){
            if(list[i]<=a){
                sum++;
            }
            a=list[i];
        }
        System.out.println(sum);
    }
}
```
[/INST]
```python
import sys

def main():
    input_string = sys.stdin.readline().strip()
    a = 'A'
    sum = 0
    for c in input_string:
        if c <= a:
            sum += 1
        a = c
    print(sum)

if __name__ == '__main__':
    main()
```
This code reads a string from standard input using `sys.stdin.readline()`, strips the newline character at the end of the string using `strip()`, and then iterates over the characters in the string using a for loop. For each character, it checks if the character is less than or equal to the previous character (stored in the variable `a`). If it is, it increments the variable `sum` by 1. Finally, it prints the value of `sum` to standard output using `print()`.

Note that in Python, the `sys` module is used to access the standard input and output streams, and the `strip()` method is used to remove the newline character at the end of the string.</s>
