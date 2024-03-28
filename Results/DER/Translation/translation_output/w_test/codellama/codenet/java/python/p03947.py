<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
BBBWW

Expected output:
1


```
import java.util.Scanner;

public class p03947 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        
        char[] input_char = input.toCharArray();
        
        char current_char = input_char[0];
        int count = 0;
        for (int i=1;i<input_char.length;i++) {
            if (input_char[i]!=current_char) {
                count++;
                current_char = input_char[i];
            }
        }
        
        System.out.println(count);
    }
}

```
[/INST]
```
import sys

input_str = sys.stdin.readline().strip()

count = 0
current_char = input_str[0]
for i in range(1, len(input_str)):
    if input_str[i] != current_char:
        count += 1
        current_char = input_str[i]

print(count)
```
This code reads a line of input from stdin, converts it to a list of characters, and then iterates over the list to count the number of times the character changes. The final count is printed to stdout.</s>
