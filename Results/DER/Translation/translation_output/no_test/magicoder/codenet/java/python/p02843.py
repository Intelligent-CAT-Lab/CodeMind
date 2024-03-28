<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02843 {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x % 100 <= x / 100 * 5) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

}
```

@@ Response
```python
# Python code

x = int(input())
if x % 100 <= x // 100 * 5:
    print(1)
else:
    print(0)
```<｜end▁of▁sentence｜>
