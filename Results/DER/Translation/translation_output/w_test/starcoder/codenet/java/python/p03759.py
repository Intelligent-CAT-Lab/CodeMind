<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 4 6

Expected output:
YES


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

python code:<fim_suffix><fim_middle>

```python
a,b,c = map(int,input().split())
if a-b == b-c:
    print("YES")
else:
    print("NO")
```
<|endoftext|>
