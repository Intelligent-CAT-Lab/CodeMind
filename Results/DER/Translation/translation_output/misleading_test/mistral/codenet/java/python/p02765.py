<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 2919

Expected output:
3764

```
import java.util.*;

public class p02765 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        if(n < 10){
            System.out.println(r+ (10 - n) * 100);
        
        }else{
            System.out.println(r);
        }
    }
}

```
[/INST]
```python
n, r = map(int, input().split())
if n < 10:
    print(r + (10 - n) * 100)
else:
    print(r)
```</s>
