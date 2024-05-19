System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
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


Answer:
```python
import sys

n = float(input())

odd = 0
notOdd = 0
for i in range(1, n+1):
    if i % 2 == 0:
        notOdd += 1
    else:
        odd += 1

print(odd / n)
```<|endoftext|>
