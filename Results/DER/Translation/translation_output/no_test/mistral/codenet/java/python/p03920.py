<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03920 {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int N = sc.nextInt();
    while (N > 0) {
      int sum = 0;
      for (int i = 1; ; i++) {
        sum += i;
        if (sum >= N) {
          System.out.println(i);
          N -= i;
          break;
        }
      }
    }
  }

}

```
[/INST]
```python
import sys

N = int(input())

while N > 0:
    sum = 0
    i = 1
    while True:
        sum += i
        if sum >= N:
            print(i)
            N -= i
            break
        i += 1
```</s>
