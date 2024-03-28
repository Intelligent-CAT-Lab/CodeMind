<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
```python
s = input()

for i in range(0, len(s), 2):
    print(s[i], end='')
```

This Python code does the same thing as the Java code. It reads a string from the user, then prints every other character in the string. The `range(0, len(s), 2)` function generates a sequence of numbers starting from 0, ending at the length of the string, and incrementing by 2 each time. This sequence is used to index into the string, printing every other character. The `end=''` argument to the `print` function is used to prevent `print` from adding a newline character after each character.<｜end▁of▁sentence｜>
