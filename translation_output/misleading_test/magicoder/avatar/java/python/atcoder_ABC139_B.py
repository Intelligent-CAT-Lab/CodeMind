<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
8 8

Expected output:
-31

```
import java.util.Scanner;

public class atcoder_ABC139_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int kuti = 1;
        int tap = 0;
        
        while (kuti < b) {
            kuti = kuti - 1 + a;
            tap++;
        }
        
        System.out.println(tap);
    }
}
```

@@ Response
```python
a, b = map(int, input().split())
kuti = 1
tap = 0

while kuti < b:
    kuti = kuti - 1 + a
    tap += 1

print(tap)
```

This Python code does the same thing as the Java code. It reads two integers from the input, initializes `kuti` and `tap` to 1 and 0 respectively, and then enters a loop where it increases `kuti` by `a` and increments `tap` until `kuti` is greater than or equal to `b`. Finally, it prints the value of `tap`.<｜end▁of▁sentence｜>
