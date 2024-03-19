<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
atcoder

Expected output:
acdro

```
import java.util.*;

class p03610{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] array = s.split("");

        for(int i = 0; i < s.length(); i += 2){
            System.out.print(array[i]);
        }
        
    }
}
```

### Response:
```python
import sys

def remove_odd_indexed_characters(s):
    return ''.join([s[i] for i in range(len(s)) if i % 2 == 0])

s = sys.stdin.readline().strip()
print(remove_odd_indexed_characters(s))
```

This Python code reads a string from the standard input, removes the characters at odd indexed positions, and prints the resulting string. The function `remove_odd_indexed_characters` uses a list comprehension to create a new string from every even-indexed character in the input string. The `join` method is used to concatenate the characters into a single string.
<|EOT|>
