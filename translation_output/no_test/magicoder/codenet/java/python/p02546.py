<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
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

s = input()
if s.endswith('s'):
    print(s + 'es')
else:
    print(s + 's')
```

This Python code does the same thing as the Java code. It prompts the user to input a string, checks if the string ends with 's', and then appends 'es' or 's' to the end of the string accordingly.<｜end▁of▁sentence｜>
