<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
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

@@ Response
```python
import sys

def count_changes(input_string):
    if not input_string:
        return 0

    current_char = input_string[0]
    count = 0
    for char in input_string[1:]:
        if char != current_char:
            count += 1
            current_char = char
    return count

if __name__ == "__main__":
    input_string = sys.stdin.readline().strip()
    print(count_changes(input_string))
```

This Python code does the same thing as the Java code. It reads a string from the standard input, counts the number of changes in the string (i.e., the number of times the character changes from one position to the next), and then prints the count.<｜end▁of▁sentence｜>
