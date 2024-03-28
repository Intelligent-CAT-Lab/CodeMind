<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

### Response:
```python
a = int(input())
b = int(input())
c = int(input())
if a-b == b-c:
    print("YES")
else:
    print("NO")
```
<|EOT|>
