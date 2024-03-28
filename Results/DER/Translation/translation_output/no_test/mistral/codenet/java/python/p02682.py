<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02682{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();
    int d = scan.nextInt();
    int sum = 0;
    if (d<=a){
      System.out.println(d);
      return;
    }
    sum = a;
    d -= a;
    if(d<=b){
      System.out.println(sum);
      return;
    }
    d-=b;
    sum -= d;
    System.out.println(sum);
  }
}

```
[/INST]
```python
import sys

a = int(input())
b = int(input())
c = int(input())
d = int(input())
sum = 0
if d <= a:
    print(d)
    return
sum = a
d -= a
if d <= b:
    print(sum)
    return
d -= b
sum -= d
print(sum)
```</s>
