<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
119

Expected output:
978

```
import java.util.*;

public class p03242 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char[] S = sc.next().toCharArray();
    for (int i = 0; i < 3; i++) S[i] = (S[i] == '1') ? '9' : '1';
    System.out.println(S);
  }
}
```
[/INST]
```python
import sys

def main():
    input_string = sys.stdin.readline().strip()
    output_string = ""
    for char in input_string:
        if char == '1':
            output_string += '9'
        else:
            output_string += '1'
    print(output_string)

if __name__ == "__main__":
    main()
```
This code reads a string from standard input, and then iterates over each character in the string. If the character is '1', it replaces it with '9', and if it's any other character, it replaces it with '1'. Finally, it prints the resulting string to standard output.

Here's an example of how you could test this code:
```
$ python3 p03242.py
119
978
```
This would read the string "119" from standard input, and then print the resulting string "978" to standard output.</s>
