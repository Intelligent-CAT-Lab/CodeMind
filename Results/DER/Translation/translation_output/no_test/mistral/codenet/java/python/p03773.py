<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;
public class p03773 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int ans = A + B > 23 ? A + B - 24 : A + B;
        System.out.println(ans);
    }
}

```
[/INST]
```python
import sys

A = int(input())
B = int(input())

ans = max(A + B - 24, A + B)
print(ans)
```</s>
