<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
public class p03671{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int[] sum = {a,b,c};
        Arrays.sort(sum);

        System.out.println(sum[0]+sum[1]);
    }

}

```
[/INST]
```python
import sys

a = int(input())
b = int(input())
c = int(input())

sum = [a, b, c]
sum.sort()

print(sum[0] + sum[1])
```</s>
