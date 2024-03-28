<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.Scanner;

public class p02664 {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        char[] c = sc.next().toCharArray();
        int count = 0;
        for (int i = 0 ; i < c.length ; i++) {
            if (c[i] == 'D' ||c[i]  ==  '?') {
                count++;
                c[i] = 'D';
            }
            System.out.print(c[i]);
        }
        System.out.print("\n");

    }

}

Translate the above java code to python.

python code:

[/INST]
```python
import sys

def main():
    input_string = sys.stdin.readline().strip()
    output_string = ""
    for char in input_string:
        if char == "D" or char == "?":
            output_string += "D"
        else:
            output_string += char
    print(output_string)

if __name__ == "__main__":
    main()
```
This code reads a line of input from the user, and then iterates over each character in the input string. If the character is "D" or "?", it replaces it with "D" in the output string. Otherwise, it keeps the original character. Finally, it prints the output string.

Note that in Python, we use `sys.stdin.readline()` to read a line of input from the user, and `strip()` to remove any trailing newline characters. We also use `print()` to print the output string, rather than `System.out.print()` in Java.</s>
