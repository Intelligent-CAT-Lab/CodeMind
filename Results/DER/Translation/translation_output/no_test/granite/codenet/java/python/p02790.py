System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
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


Answer:
```python
import sys

a = int(sys.stdin.readline())
b = int(sys.stdin.readline())

if a >= b:
    for i in range(a):
        print(b, end='')
else:
    for i in range(b):
        print(a, end='')
```<|endoftext|>
