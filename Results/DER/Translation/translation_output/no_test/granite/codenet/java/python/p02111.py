System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
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


Answer:
```python
import math

n = int(input())
minute = int(math.floor(12 * 60 * n / 360))
print(minute // 60, minute % 60)
```<|endoftext|>
