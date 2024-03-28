<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 8 7 1

Expected output:
eft

```
import java.util.*;

public class p03477 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int left = sc.nextInt() + sc.nextInt();
        int right = sc.nextInt() + sc.nextInt();
        if(left > right) {
            System.out.print("Left");
        } else if (left == right) {
            System.out.print("Balanced");
        } else {
            System.out.print("Right");
        }
    }
}

```
[/INST]
```python
left, right = map(int, input().split())
if left > right:
    print("Left")
elif left == right:
    print("Balanced")
else:
    print("Right")
```</s>
