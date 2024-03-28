<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
8 13

Expected output:
2


```
import java.util.Scanner;

class p03328 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int n = b - a;
    System.out.println(n * (n + 1) / 2 - b);
  }
}

```
[/INST]
```python
a = int(input())
b = int(input())
n = b - a
print(n * (n + 1) // 2 - b)
```</s>
