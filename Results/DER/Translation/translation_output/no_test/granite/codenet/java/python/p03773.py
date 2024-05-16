System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
```
import java.util.Scanner;
public class p03773 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int ans = A + B > 23? A + B - 24 : A + B;
        System.out.println(ans);
    }
}

```


Answer:
```python
import sys

A, B = map(int, sys.stdin.readline().split())

ans = A + B
if ans > 23:
    ans -= 24

print(ans)
```<|endoftext|>
