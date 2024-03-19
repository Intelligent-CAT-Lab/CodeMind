<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
apple

Expected output:
DmdZQr

```
import java.util.Scanner;

public class p02546 {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
       String s = sc.next();
       if (s.endsWith("s")) {
           System.out.println(s + "es");
       } else {
           System.out.println(s + "s");
       }



    }

}

```

@@ Response
```python
# Python code

def add_s(s):
    if s.endswith('s'):
        return s + 'es'
    else:
        return s + 's'

# Test input
s = input()

# Expected output
print(add_s(s))
```

In this Python code, we define a function `add_s` that takes a string `s` as input. If the string `s` ends with 's', it appends 'es' to the end of the string. If not, it appends 's' to the end of the string. The function is then called with the test input 'apple', and the result is printed.<｜end▁of▁sentence｜>
