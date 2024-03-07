<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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


Translate the above java code to python.

python code:

[/INST]
```python
import sys

a, b, c, d = map(int, sys.stdin.readline().split())

if d <= a:
    print(d)
    sys.exit()

sum = a
d -= a

if d <= b:
    print(sum)
    sys.exit()

d -= b
sum -= d

print(sum)
```
Note: The `sys.exit()` function is used to exit the program after printing the result.</s>
