<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02790 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a >= b)
            for (int i = 0; i < a; i++)
                System.out.print(b);
        else
            for (int i = 0; i < b; i++)
                System.out.print(a);

    }
}

```
[/INST]
```python
import sys

a = int(input())
b = int(input())

if a >= b:
    for i in range(a):
        print(b, end='')
else:
    for i in range(b):
        print(a, end='')
```</s>
