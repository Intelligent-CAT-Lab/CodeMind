<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 10

Expected output:
32

```
import java.util.Scanner;
public class p02922 {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    int ans = (b-1)/(a-1);
    if((b-1)%(a-1)==0) {
    	System.out.println(ans);
    }else {
    	System.out.println(ans+1);
    }
    }
}
```
[/INST]
```python
a = int(input())
b = int(input())

ans = (b-1)//(a-1)
if (b-1) % (a-1) == 0:
    print(ans)
else:
    print(ans+1)
```</s>
