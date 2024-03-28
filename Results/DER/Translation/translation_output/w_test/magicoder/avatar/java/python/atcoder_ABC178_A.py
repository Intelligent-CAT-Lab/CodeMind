<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
0

Expected output:
1


```
public class atcoder_ABC178_A {
    public static void main(String[] args) {
        int x = new java.util.Scanner(System.in).nextInt();
        if (x == 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
```

@@ Response
```python
x = int(input())
if x == 0:
    print(1)
else:
    print(0)
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, and then prints 1 if the input is 0, and 0 otherwise.<｜end▁of▁sentence｜>
