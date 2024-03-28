<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
apple

Expected output:
apples


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
def pluralize(s):
    if s.endswith('s'):
        return s + 'es'
    else:
        return s + 's'

s = input()
print(pluralize(s))
```

This Python code does the same thing as the Java code. It reads a string from the user, checks if it ends with 's', and if it does, it appends 'es' to the end of the string. If it doesn't, it appends 's' to the end of the string.<｜end▁of▁sentence｜>
