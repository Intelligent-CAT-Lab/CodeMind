<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
7 3

Expected output:
1


```
import java.util.*;

public class p03284{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),k=sc.nextInt();
        if(n%k == 0){
            System.out.println(0);
        }else{
            System.out.println(1);
        }
    }
}
```
[/INST]
```python
n, k = map(int, input().split())
if n % k == 0:
    print(0)
else:
    print(1)
```</s>
