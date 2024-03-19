<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 2

Expected output:
kg-

```
import java.util.*;

public class p03129 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        if((sc.nextInt() + 1) / 2 >= sc.nextInt()) System.out.println("YES");
        else System.out.println("NO");
    }

}



```
[/INST]
```python
n = int(input())
x = int(input())
y = int(input())
if (x + 1) // 1 added to handle case of 0
    // division by 2 is floor division in python
    if (x + 1 // 1 added to handle case of 0
        // division by 2 is floor division in python
        >= y):
        print("YES")
    else:
        print("NO")
else:
    print("NO")
```</s>
