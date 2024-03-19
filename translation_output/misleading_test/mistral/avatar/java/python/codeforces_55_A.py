<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
512

Expected output:
YGk

```
import java.util.*;

public class codeforces_55_A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if ((n & (n - 1)) == 0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
```
[/INST]
```python
n = int(input())
if (n & (n - 1) == 0:
    print("YES")
else:
    print("NO")
```</s>
