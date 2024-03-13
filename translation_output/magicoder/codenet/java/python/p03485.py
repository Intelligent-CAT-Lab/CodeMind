<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03485 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(solve(a, b));

        sc.close();
    }

    static int solve(int a, int b) {
        return (a + b + 1) / 2;
    }
}
```

@@ Response
```python
def solve(a, b):
    return (a + b + 1) // 2

a = int(input())
b = int(input())

print(solve(a, b))
```<｜end▁of▁sentence｜>
