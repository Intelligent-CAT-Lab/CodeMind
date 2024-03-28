<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
6 4 3

Expected output:
38

```
import java.util.*;

public class p02951 {
  public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int a = sc.nextInt();
          int b = sc.nextInt();
          int c = sc.nextInt();
          if(b + c < a){
              System.out.println(0);
          } else {
            System.out.println(b + c - a);
          }
        }
    }
```
[/INST]
```python
a = int(input())
b = int(input())
c = int(input())
if b + c < a:
    print(0)
else:
    print(b + c - a)
```</s>
