<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
30 100

Expected output:
100


```
import java.util.*;

class p03035{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    if(a<=5){
      System.out.println(0);
    }
    else if(a<=12){
      System.out.println((int)(b/2));
    }
    else{
      System.out.println(b);
    }
  }
}
```

python code:<fim_suffix><fim_middle>

```python
import sys

a,b = map(int,sys.stdin.readline().split())

if a<=5:
    print(0)
elif a<=12:
    print(b//2)
else:
    print(b)
```
<|endoftext|>
