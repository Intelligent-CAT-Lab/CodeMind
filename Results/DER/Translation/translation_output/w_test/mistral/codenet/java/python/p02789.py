<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 3

Expected output:
Yes


```
import java.util.*;
public class p02789{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    if (n==m) {
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }
 
  }
}
```
[/INST]
```python
n, m = map(int, input().split())
if n == m:
    print("Yes")
else:
    print("No")
```</s>
