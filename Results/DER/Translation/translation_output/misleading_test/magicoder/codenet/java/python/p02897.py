<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4

Expected output:
-53.85961348061815

```
import java.util.Scanner;

public class p02897 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    double n = sc.nextDouble();

    double odd = 0;
    double notOdd = 0;
    for (int i = 1; i <= n; i++) {
      if (i % 2 == 0) {
        notOdd++;
      } else {
        odd++;
      }
    }
    System.out.println(odd / n);
  }
}

```

@@ Response
```python
n = int(input())

odd = 0
not_odd = 0
for i in range(1, n + 1):
    if i % 2 == 0:
        not_odd += 1
    else:
        odd += 1

print(odd / n)
```

Test input:
4

Expected output:
0.5<｜end▁of▁sentence｜>
