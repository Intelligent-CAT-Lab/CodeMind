<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 3 2

Expected output:
YES


```
import java.util.*;
public class p03693 {
 
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int r=scan.nextInt()*100;
        int g=scan.nextInt()*10;
        int b=scan.nextInt();
 
        int sum=r+g+b;
        System.out.println(sum%4==0?"YES":"NO");
 
    }
}
```

python code:<fim_suffix><fim_middle>

```python
import sys

r, g, b = map(int, sys.stdin.readline().split())

if (r + g + b) % 4 == 0:
    print("YES")
else:
    print("NO")
```
<|endoftext|>
