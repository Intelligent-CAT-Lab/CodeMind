<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;public class p03241{public static void main(String[]a){Scanner s=new Scanner(System.in);int n=s.nextInt();int m=s.nextInt();for(int i=m/n;true;i--)if(m%i==0){System.out.print(i);break;}}}

```
[/INST]
```python
import sys

n, m = map(int, input().split())
for i in range(m // n, 0, -1):
    if m % i == 0:
        print(i)
        break
```</s>
