<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 8

Expected output:
Yes


```
import java.util.*;
import java.lang.Integer; 

public class p02640 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double x = sc.nextInt(); // é ­æ°
    double y = sc.nextInt(); // è¶³ã®æ°
    double crane = -(y/2) + 2*x;
    double turtle = x - crane;
    if(turtle < 0 || crane < 0 || turtle % 1 != 0 || crane % 1 != 0 ){
      System.out.println("No");
    }else{
      System.out.println("Yes");
    }
  }
}
```
[/INST]
```python
import sys

x, y = map(int, sys.stdin.readline().split())
crane = -(y/2) + 2*x
turtle = x - crane
if turtle < 0 or crane < 0 or turtle % 1 != 0 or crane % 1 != 0:
    print("No")
else:
    print("Yes")
```</s>
