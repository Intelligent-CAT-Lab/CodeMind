<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 3 2

Expected output:
Yes


```
import java.util.*;

public class p03719 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        String result = "No";
        if (a <= c && c <= b) result ="Yes";
        
        System.out.println(result);
      
    }
}

```

python code:<fim_suffix><fim_middle>

```python
import sys

a,b,c = map(int,sys.stdin.readline().split())

if a <= c and c <= b:
    print("Yes")
else:
    print("No")
```
<|endoftext|>
