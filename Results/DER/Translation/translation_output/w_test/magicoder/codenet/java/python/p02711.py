<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
117

Expected output:
Yes


```
import java.util.Scanner;

class p02711 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String string = String.valueOf(n);
        System.out.println(string.contains("7") ? "Yes" : "No");
    }
}
```

@@ Response
```python
n = int(input())
string = str(n)
print("Yes" if "7" in string else "No")
```

This Python code does the same thing as the Java code. It reads an integer from the user, converts it to a string, and then checks if the string contains the digit "7". If it does, it prints "Yes"; otherwise, it prints "No".<｜end▁of▁sentence｜>
