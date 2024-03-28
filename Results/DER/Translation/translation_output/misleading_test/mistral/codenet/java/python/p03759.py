<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 4 6

Expected output:
YE

```
import java.util.Scanner;

public class p03759 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    if (a-b == b-c) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}
```
[/INST]
```python
a = int(input())
b = int(input())
c = int(input())
if a-b == b-c:
    print("YES")
else:
    print("NO")
```</s>
