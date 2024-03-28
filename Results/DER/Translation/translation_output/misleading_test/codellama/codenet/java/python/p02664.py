<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
PD?D??P

Expected output:
PDPDP1DP

```
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
```
[/INST]
```python
import sys

def main():
    input_string = sys.stdin.readline().strip()
    output_string = ""
    count = 0
    for char in input_string:
        if char == "D" or char == "?":
            count += 1
            char = "D"
        output_string += char
    print(output_string)
    print(count)

if __name__ == "__main__":
    main()
```
This code reads a string from standard input, and then iterates over each character in the string. If the character is "D" or "?", it increments a counter and replaces the character with "D". Finally, it prints the modified string and the value of the counter.

Note that the code uses the `strip()` method to remove any trailing newline characters from the input string, and the `readline()` method to read a single line of input from standard input. The `if __name__ == "__main__":` block is used to ensure that the `main()` function is only executed if the script is run as a standalone program, rather than being imported as a module.</s>
