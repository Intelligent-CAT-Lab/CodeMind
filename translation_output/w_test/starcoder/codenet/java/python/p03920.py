<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4

Expected output:
1
3


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

python code:<fim_suffix><fim_middle>

```python
import sys

N = int(sys.stdin.readline())
while N > 0:
    sum = 0
    for i in range(1, N+1):
        sum += i
        if sum >= N:
            print(i)
            N -= i
            break
```
<|endoftext|>
