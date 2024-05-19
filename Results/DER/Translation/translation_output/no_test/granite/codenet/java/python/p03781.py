System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03781 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt(), i = 1;
        for (; i * (i + 1) / 2 < x; i++) {}
        System.out.println(i);
    }
}
```


Answer:
```python
import sys

x = int(sys.stdin.read())
i = 1
while i * (i + 1) // 2 < x:
    i += 1
print(i)
```<|endoftext|>
