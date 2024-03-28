<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
0

Expected output:
-43 -89

```
import java.util.*;

public class p02111 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int minute = 12 * 60 * n / 360;
        System.out.println((minute / 60) + " " + (minute % 60));
    }
}

```
[/INST]
```python
n = int(input())
minute = 12 * 60 * n / 360
print((minute // 60) + " " + (minute % 60))
```</s>
