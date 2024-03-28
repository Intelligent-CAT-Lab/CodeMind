<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02759 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    System.out.printf("%d", (N + 1) / 2);
    sc.close();
    return;
  }
}
```
[/INST]
```python
import sys

N = int(input())
print(int((N + 1) / 2))
```</s>
