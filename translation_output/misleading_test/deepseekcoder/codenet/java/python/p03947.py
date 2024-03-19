<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
BBBWW

Expected output:
-31

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

### Response:
```python
def count_changes(input_string):
    input_char = list(input_string)
    current_char = input_char[0]
    count = 0
    for i in range(1, len(input_char)):
        if input_char[i] != current_char:
            count += 1
            current_char = input_char[i]
    return count

input_string = input()
print(count_changes(input_string))
```

In this Python code, we define a function `count_changes` that takes a string as input and returns the number of changes in the string. The function works by iterating over the characters in the string and counting the number of times the current character is different from the next one. The function is then called with the input string provided by the user.
<|EOT|>
