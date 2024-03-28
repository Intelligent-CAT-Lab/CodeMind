<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 5 3

Expected output:
3 5


```
import java.util.*;
public class p02439 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int min = Math.min(a,b);
        int max = Math.max(a,b);
        System.out.println(Math.min(min,c)+" "+Math.max(max,c));
    }
}

```
[/INST]
```python
a = int(input())
b = int(input())
c = int(input())
min = min(a,b)
max = max(a,b)
print(min(min,c)+" "+max(max,c))
```</s>
