<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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
import sys
n = int(input())
m = int(input())
if n == m:
    print("Yes")
else:
    print("No")
```</s>
