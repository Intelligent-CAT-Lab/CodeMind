<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
```python
input_str = input()

input_char = list(input_str)

current_char = input_char[0]
count = 0
for i in range(1, len(input_char)):
    if input_char[i] != current_char:
        count += 1
        current_char = input_char[i]

print(count)
```

This Python code does the same thing as the Java code. It reads a string from the user, converts it to a list of characters, and then iterates through the list. For each character, it checks if it's the same as the previous character. If it's not, it increments a counter and updates the current character. Finally, it prints the counter.<｜end▁of▁sentence｜>
