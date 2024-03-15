<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
import java.lang.*;


public class p03796 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        double power = 1;
        for (int i = 1; i <= cnt; i++) {
            power = (power*i)%(Math.pow(10, 9) + 7);
        }
        System.out.println((int)power);
    }
}
```
[/INST]
```python
import sys

n = int(input())
power = 1
for i in range(1, n+1):
    power = (power*i)%(10**9+7)
print(int(power))
```</s>
