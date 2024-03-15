<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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
import sys

n = int(input())
minute = 12 * 60 * n / 360
print((minute // 60) + " " + (minute % 60))
```</s>
