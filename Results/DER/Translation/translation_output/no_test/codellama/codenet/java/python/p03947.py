<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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


Translate the above java code to python.

python code:

[/INST]
```
import sys

input_string = sys.stdin.readline().strip()

count = 0
current_char = input_string[0]
for char in input_string[1:]:
    if char != current_char:
        count += 1
        current_char = char

print(count)
```
This code uses the `sys` module to read a line of input from the standard input stream, and then uses a `for` loop to iterate over the characters in the input string. It keeps track of the current character and the count of characters that are different from the current character, and prints the count at the end.

Note that the `strip()` method is used to remove any trailing newline characters from the input string.</s>
